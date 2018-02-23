package olap;

public class AeroportoDTO {
    private String nome;
    private int nPartidas;
    private int nChegadas;
    private int nVoosCancelados;
    private int nVoosDesviados;
    private int somaTaxiOut;
    private int somaTaxiIn;
    private int periodo;
    
    public AeroportoDTO(String nome, int nPartidas, int nChegadas, int nVoosCancelados, int nVoosDesviados, int somaTaxiOut, int somaTaxiIn, int periodo) {
        this.nome = nome;
        this.nPartidas = nPartidas;
        this.nChegadas = nChegadas;
        this.nVoosCancelados = nVoosCancelados;
        this.nVoosDesviados = nVoosDesviados;
        this.somaTaxiOut = somaTaxiOut;
        this.somaTaxiIn = somaTaxiIn;
        this.periodo = periodo;
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
    
    public int getSomaTaxiOut() {
        return somaTaxiOut;
    }
    
    public int getSomaTaxiIn() {
        return somaTaxiIn;
    }
    
    public int getPeriodo() {
        return periodo;
    }
    
    public float getPercentagemVoosCancelados() {
        try{
            return (nVoosCancelados * 1f/nPartidas) * 100;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public float getPercentagemVoosDesviados() {
        try{
            return (nVoosDesviados * 1f/nChegadas) * 100;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public int getTaxiOutMedio() {
        try{
            return somaTaxiOut/nPartidas;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public int getTaxiInMedio() {
        try{
            return somaTaxiIn/nChegadas;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    
    public String toString() {
        return "Nome: " + nome + ", nPartidas: " + nPartidas + ", nChegadas: " + nChegadas + ", nVoosCancelados: " + nVoosCancelados + ", nVoosDesviados" + 
                nVoosDesviados + ", somaTaxiOut: " + somaTaxiOut + ", somaTaxiIn: " + somaTaxiIn;
    }
}