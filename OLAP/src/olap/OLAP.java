package olap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OLAP {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/in";
    private static final String USER = "postgres";
    private static final String PASS = "1994";
    
    public static void main(String[] args) {
        OLAP olap = new OLAP();
        Interface i = new Interface(olap);
        i.setVisible(true);
    }
    
    protected List<CompanhiaAereaDTO> informacaoVoosCompanhiasAereas(int diaInicio, int mesInicio, int diaFinal, int mesFinal, String orderByQ1, String orderByQ2) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        int i, somaTempoVoo, somaDistanciaPercorrida;
        String nome;
        List<CompanhiaAereaDTO> listaCompanhiasAereas = new ArrayList<CompanhiaAereaDTO>();
        try{
            pstmt = conn.prepareStatement(
                "select nome, sum(nPartidas), sum(nChegadas), sum(nVoosCancelados), sum(nVoosDesviados), sum(nVoosAtrasadosP), sum(somaTempoAtrasoP), sum(nVoosAtrasadosC), sum(somaTempoAtrasoC), sum(atrasoSistemaAereo), sum(atrasoCompanhiaAerea), sum(atrasoVerificacoesTecnicas), sum(atrasoCondicoesMeterologicas) " +
                "from tabela1 " +
                "where idTempo >= (select idTempo from tempo where mes = ? and dia = ?) and idTempo <= (select idTempo from tempo where mes = ? and dia = ?) " +
                "group by nome " +
                "order by " + orderByQ1);
            pstmt.setInt(1, mesInicio);
            pstmt.setInt(2, diaInicio);
            pstmt.setInt(3, mesFinal);
            pstmt.setInt(4, diaFinal);
            rs = pstmt.executeQuery();
            while (rs.next()){
                CompanhiaAereaDTO ca = new CompanhiaAereaDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13));
                listaCompanhiasAereas.add(ca);
            }
            pstmt = conn.prepareStatement(
                "select ca.nome, sum(fca.somaTempoVoo), sum(fca.somaDistanciaPercorrida) " +
                "from factosCompanhiaAerea fca, companhiaAerea ca, tempo t " +
                "where fca.idCompanhia = ca.idCompanhia and fca.idTempo = t.idTempo and t.idTempo >= (select idTempo from tempo where mes = ? and dia = ?) and t.idTempo <= (select idTempo from tempo where mes = ? and dia = ?) " +
                "group by ca.nome " +
                "order by " + orderByQ2);
            pstmt.setInt(1, mesInicio);
            pstmt.setInt(2, diaInicio);
            pstmt.setInt(3, mesFinal);
            pstmt.setInt(4, diaFinal);
            rs = pstmt.executeQuery();
            while (rs.next()){
                nome = rs.getString(1);
                somaTempoVoo = rs.getInt(2);
                somaDistanciaPercorrida = rs.getInt(3);
                for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
                    if (listaCompanhiasAereas.get(i).getNome().equals(nome)){
                        listaCompanhiasAereas.get(i).setSomaTempoVoo(somaTempoVoo);
                        listaCompanhiasAereas.get(i).setSomaDistanciaPercorrida(somaDistanciaPercorrida);
                        break;
                    }
                }
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return listaCompanhiasAereas;
    }
    
    protected List<CompanhiaAereaDTO> informacaoVoosCompanhiaAerea(String companhiaAerea, String periodo) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        int i = 0;
        List<CompanhiaAereaDTO> listaCompanhiasAereas = new ArrayList<CompanhiaAereaDTO>();
        try{
            pstmt = conn.prepareStatement(
                "select sum(f.nPartidas), sum(f.nChegadas), sum(f.nVoosCancelados), sum(f.nVoosDesviados), sum(f.nVoosAtrasadosP), sum(f.somaTempoAtrasoP), sum(f.nVoosAtrasadosC), sum(f.somaTempoAtrasoC) " +
                "from factos f, companhiaAerea ca, tempo t " +
                "where f.idCompanhia = ca.idCompanhia and f.idTempo = t.idTempo and ca.nome = ? " +
                "group by t." + periodo + " " +
                "order by t." + periodo + " asc");
            pstmt.setString(1, companhiaAerea);
            rs = pstmt.executeQuery();
            while (rs.next()){
                CompanhiaAereaDTO ca = new CompanhiaAereaDTO(companhiaAerea, rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), 0, 0, 0, 0);
                listaCompanhiasAereas.add(ca);
            }
            pstmt = conn.prepareStatement(
                "select sum(fca.lucroLiquido) " +
                "from factosCompanhiaAerea fca, companhiaAerea ca, tempo t " +
                "where fca.idTempo = t.idTempo and fca.idCompanhia = ca.idCompanhia and ca.nome = ? " +
                "group by t." + periodo + " " +
                "order by t." + periodo + " asc");
            pstmt.setString(1, companhiaAerea);
            rs = pstmt.executeQuery();
            while (rs.next() && i < listaCompanhiasAereas.size()){
                listaCompanhiasAereas.get(i).setLucroLiquido(rs.getInt(1));
                i = i + 1;
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return listaCompanhiasAereas;
    }
    
    protected List<AeroportoDTO> informacaoVoosAeroportos(int diaInicio, int mesInicio, int diaFinal, int mesFinal, String orderBy) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        List<AeroportoDTO> listaAeroportos = new ArrayList<AeroportoDTO>();
        try{
            pstmt = conn.prepareStatement(
                "select nome, sum(nPartidas), sum(nChegadas), sum(nVoosCancelados), sum(nVoosDesviados), sum(somaTaxiOut), sum(somaTaxiIn) " +
                "from tabela2 " +
                "where idTempo >= (select idTempo from tempo where mes = ? and dia = ?) and idTempo <= (select idTempo from tempo where mes = ? and dia = ?) " +
                "group by nome " +
                "order by " + orderBy);
            pstmt.setInt(1, mesInicio);
            pstmt.setInt(2, diaInicio);
            pstmt.setInt(3, mesFinal);
            pstmt.setInt(4, diaFinal);
            rs = pstmt.executeQuery();
            while (rs.next()){
                AeroportoDTO a = new AeroportoDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), 0);
                listaAeroportos.add(a);
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return listaAeroportos;
    }
    
    protected List<AeroportoDTO> informacaoVoosAeroporto(String aeroporto, String periodo) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        List<AeroportoDTO> listaAeroportos = new ArrayList<AeroportoDTO>();
        try{
            pstmt = conn.prepareStatement(
                "select a.nome, sum(f.nPartidas), sum(f.nChegadas), sum(f.nVoosCancelados), sum(f.nVoosDesviados), t." + periodo + " " +
                "from factos f, aeroporto a, tempo t " +
                "where f.idAeroporto = a.idAeroporto and f.idTempo = t.idTempo and a.nome = ? " +
                "group by t." + periodo + ",a.nome " +
                "order by t." + periodo + " asc");
            pstmt.setString(1, aeroporto);
            rs = pstmt.executeQuery();
            while (rs.next()){
                AeroportoDTO a = new AeroportoDTO(aeroporto, rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), 0, 0, rs.getInt(6));
                listaAeroportos.add(a);
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return listaAeroportos;
    }
    
    protected String obterHubCompanhiaAerea(String companhiaAerea) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        try{
            pstmt = conn.prepareStatement("select hub from companhiaAerea where nome = ?");
            pstmt.setString(1, companhiaAerea);
            rs = pstmt.executeQuery();
            if (rs.next()){
                return rs.getString(1);
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return null;
    }
    
    protected List<AeroportoDTO> informacaoHub(String aeroporto) {
        Connection conn = obterConexao();
        PreparedStatement pstmt;
        ResultSet rs;
        List<AeroportoDTO> listaAeroportos = new ArrayList<AeroportoDTO>();
        try{
            pstmt = conn.prepareStatement(
                "select ca.nome, sum(nPartidas), sum(nChegadas), sum(somaTaxiOut), sum(somaTaxiIn) " +
                "from factos f, companhiaAerea ca, aeroporto a " +
                "where f.idCompanhia = ca.idCompanhia and f.idAeroporto = a.idAeroporto and a.nome = ? " +
                "group by ca.nome " +
                "order by ca.nome asc");
            pstmt.setString(1, aeroporto);
            rs = pstmt.executeQuery();
            while (rs.next()){
                AeroportoDTO a = new AeroportoDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), 0, 0, rs.getInt(4), rs.getInt(5), 0);
                listaAeroportos.add(a);
            }
            rs.close(); pstmt.close(); conn.close();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
        return listaAeroportos;
    }
    
    private Connection obterConexao() {
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
        return conn;
    }
}