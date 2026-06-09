public abstract class Quarto implements Financeiro {

    protected int numero;
    protected double precoBasa;
    protected boolean isOcupado;

  public Quarto(int n, double pB){
     this.numero =n;
     this.precoBasa = pB;
     this.isOcupado = false;
    
   }
   public int getNumero(){
     return this.numero;
   }
   public double getPrecoBase(){
    return this.precoBasa;
   }
   public boolean getIsOcupado(){
      return this.isOcupado;
   }
   public void setIsOcupado(boolean ocupado){
     this.isOcupado = ocupado;
   }

}
