public class QuartoSimples extends Quarto {
     
    public QuartoSimples(int n, double pB){
        super(n, pB);
    }
    
    @Override
    public double calcularTotal( int daiarias){
        return this.precoBasa * daiarias;
    }
}
