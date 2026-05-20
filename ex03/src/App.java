public class App {
    public static void main(String[] args) throws Exception {
      
        Locadora c1 = new Locadora("Sedan", "Fait", 2018, "azul");

        Locadora c2 = new Locadora("Polo" , "volkswagen", 2023, "prata ");
        
     
        c1.setAno(2000);
        

        System.out.println(" Locadora 2 "+ c2.getModelo());
         System.out.println(" Locadora 1 "+ c1.getModelo());
      
    }  
     
}
