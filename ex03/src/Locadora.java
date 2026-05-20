public class Locadora {

    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public Locadora(String mdl, String mar, int ano, String cor) {
        this.modelo = mdl;
        this.marca = mar;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    
    public void setAno( int anoNovo){
        this.ano = anoNovo;
    }



    
    
   
}
