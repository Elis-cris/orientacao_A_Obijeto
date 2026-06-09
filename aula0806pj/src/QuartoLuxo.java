public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int n, double pB){
        super(n, pB);
    }
    @Override
    public double calcularTotal( int daiarias){
        return this.precoBasa * daiarias * 1.20;
    }
}
