public class Produto {

 String  nome;
 double  preco;
 int quantideDeEstoque;
 

 public void acicioanarEstoque(int quantidade){
    this.quantideDeEstoque =  this.quantideDeEstoque + quantidade;

    System.out.println("Estoque alualizado!");
 }


    
}
