package olap;

public class CompanhiaAereaDTO {
    private String nome;
    private int nPartidas;
    private int nChegadas;
    private int nVoosCancelados;
    private int nVoosDesviados;
    private int nVoosAtrasadosP;
    private int somaTempoAtrasoP;
    private int nVoosAtrasadosC;
    private int somaTempoAtrasoC;
    private int atrasoSistemaAereo;
    private int atrasoCompanhiaAerea;
    private int atrasoVerificacoesTecnicas;
    private int atrasoCondicoesMeterologicas;
    private int somaTempoVoo;
    private int somaDistanciaPercorrida;
    private int lucroLiquido;
    
    public CompanhiaAereaDTO(String nome, int nPartidas, int nChegadas, int nVoosCancelados, int nVoosDesviados, int nVoosAtrasadosP, int somaTempoAtrasoP, int nVoosAtrasadosC, int somaTempoAtrasoC, int atrasoSistemaAereo, int atrasoCompanhiaAerea, int atrasoVerificacoesTecnicas, int atrasoCondicoesMeterologicas) {
        this.nome = nome;
        this.nPartidas = nPartidas;
        this.nChegadas = nChegadas;
        this.nVoosCancelados = nVoosCancelados;
        this.nVoosDesviados = nVoosDesviados;
        this.nVoosAtrasadosP = nVoosAtrasadosP;
        this.somaTempoAtrasoP = somaTempoAtrasoP;
        this.nVoosAtrasadosC = nVoosAtrasadosC;
        this.somaTempoAtrasoC = somaTempoAtrasoC;
        this.atrasoSistemaAereo = atrasoSistemaAereo;
        this.atrasoCompanhiaAerea = atrasoCompanhiaAerea;
        this.atrasoVerificacoesTecnicas = atrasoVerificacoesTecnicas;
        this.atrasoCondicoesMeterologicas = atrasoCondicoesMeterologicas;
    }
    
    public void setSomaTempoVoo(int somaTempoVoo) {
        this.somaTempoVoo = somaTempoVoo;
    }
    
    public void setSomaDistanciaPercorrida(int somaDistanciaPercorrida) {
        this.somaDistanciaPercorrida = somaDistanciaPercorrida;
    }
    
    public void setLucroLiquido(int lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getNPartidas() {
        return nPartidas;
    }
    
    public int getNChegadas() {
        return nChegadas;
    }
    
    public int getNVoosCancelados() {
        return nVoosCancelados;
    }
    
    public int getNVoosDesviados() {
        return nVoosDesviados;
    }
    
    public int getNVoosAtrasadosP() {
        return nVoosAtrasadosP;
    }
    
    public int getSomaTempoAtrasoP() {
        return somaTempoAtrasoP;
    }
    
    public int getNVoosAtrasadosC() {
        return nVoosAtrasadosC;
    }
    
    public int getSomaTempoAtrasoC() {
        return somaTempoAtrasoC;
    }
    
    public int getAtrasoSistemaAereo() {
        return atrasoSistemaAereo;
    }
    
    public int getAtrasoCompanhiaAerea() {
        return atrasoCompanhiaAerea;
    }
    
    public int getAtrasoVerificacoesTecnicas() {
        return atrasoVerificacoesTecnicas;
    }
    
    public int getAtrasoCondicoesMeterologicas() {
        return atrasoCondicoesMeterologicas;
    }
    
    public int getSomaTempoVoo() {
        return somaTempoVoo;
    }
    
    public int getSomaDistanciaPercorrida() {
        return somaDistanciaPercorrida;
    }
    
    public int getLucroLiquido() {
        return lucroLiquido;
    }
    
    public float getPercentagemNVoosCancelados() {
        try{
            return (nVoosCancelados * 1f/nPartidas) * 100;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemNVoosDesviados() {
        try{
            return (nVoosDesviados * 1f/nChegadas) * 100;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemVoosAtrasadosP() {
        try{
            return (nVoosAtrasadosP * 1f/nPartidas) * 100;
        } catch (ArithmeticException e){
            return 0;
        } 
    }
    
    public float getTempoMedioAtrasoP() {
        try{
            return (somaTempoAtrasoP * 1f)/nVoosAtrasadosP;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemVoosAtrasadosC() {
        try{
            return (nVoosAtrasadosC * 1f/nChegadas) * 100;
        } catch (ArithmeticException e){
            return 0;
        } 
    }
    
    public float getTempoMedioAtrasoC() {
        try{
            return (somaTempoAtrasoC * 1f)/nVoosAtrasadosC;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemAtrasoSistemaAereo() {
        try{
            return ((atrasoSistemaAereo * 1f)/(atrasoSistemaAereo + atrasoCompanhiaAerea + atrasoVerificacoesTecnicas + atrasoCondicoesMeterologicas)) * 100f;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemAtrasoCompanhiaAerea() {
        try{
            return ((atrasoCompanhiaAerea * 1f)/(atrasoSistemaAereo + atrasoCompanhiaAerea + atrasoVerificacoesTecnicas + atrasoCondicoesMeterologicas)) * 100f;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemAtrasoVerificacoesTecnicas() {
        try{
            return ((atrasoVerificacoesTecnicas * 1f)/(atrasoSistemaAereo + atrasoCompanhiaAerea + atrasoVerificacoesTecnicas + atrasoCondicoesMeterologicas)) * 100f;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemAtrasoCondicoesMeterologicas() {
        try{
            return ((atrasoCondicoesMeterologicas* 1f)/(atrasoSistemaAereo + atrasoCompanhiaAerea + atrasoVerificacoesTecnicas + atrasoCondicoesMeterologicas)) * 100f;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getVelocidadeMediaVoo() {
        try{
            return (somaDistanciaPercorrida * 1.609f)/somaTempoVoo * 60f;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public String toString() {
        return "nome: " + nome + ", nPartidas: " + nPartidas + ", nChegadas: " + nChegadas + ", nVoosCancelados: " + nVoosCancelados + ", nVoosDesviados: " + 
                nVoosDesviados + ", nVoosAtrasadosP: " + nVoosAtrasadosP + ", somaTempoAtrasoP: " + somaTempoAtrasoP + ", nVoosAtrasadosC: " + nVoosAtrasadosC + 
                ", somaTempoAtrasoC: " + somaTempoAtrasoC + ", atrasoSistemaAereo: " + atrasoSistemaAereo + ", atrasoCompanhiaAerea: " + atrasoCompanhiaAerea +
                ", atrasoVerificacoesTecnicas: " + atrasoVerificacoesTecnicas + ", atrasoCondicoesMeterologicas: " + atrasoCondicoesMeterologicas +
                ", somaTempoVoo: " + somaTempoVoo + ", somaDistanciaPercorrida: " + somaDistanciaPercorrida + ", lucroLiquido: " + lucroLiquido;
    }
}