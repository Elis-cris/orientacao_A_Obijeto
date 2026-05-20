public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Aqui é a main");

        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 1000.0;
        produto1.quantideDeEstoque = 101;
        produto1.quantideDeEstoque = 25;

        System.out.println(produto1.preco + produto1.quantideDeEstoque);

        Produto produto2 = new Produto();

        produto2.nome = "Mause";
        produto2.preco = 10.0;
        produto2.quantideDeEstoque = 50;

        double precoTotalP2 = produto2.preco * produto2.quantideDeEstoque;
        System.out.println(produto2.preco * produto2.quantideDeEstoque);


        produto1.acicioanarEstoque(25);
        


    }

}
