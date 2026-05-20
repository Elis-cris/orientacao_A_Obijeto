public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public void emprestar(){
        if(this.disponivel == true){
           this.disponivel = false;
          System.out.println("Emprestimo  realializado");
        }else{
            System.out.println("Livro indisponivel");
        }
     }

    public void devolver() {
        this.disponivel = true;
        System.out.println("L");
    }
}
