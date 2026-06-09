import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Quarto[] quantos =new Quarto[5];

        quantos[0] = new QuartoSimples(101,100);
        quantos[1] = new QuartoLuxo(102,250);
        quantos[2] = new QuartoSimples(103,100);
        quantos[3] = new QuartoLuxo(104,250);
        quantos[4] = new QuartoLuxo(105,250);

        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Hospedagem> hospede = new ArrayList<>();

int opcao = 0;
    do{
     System.out.println("1 - cadastrar cliente");
     System.out.println("2 - Check-in");   
     System.out.println("3 - check-out(inativer)");   
     System.out.println("4 -Balanco do caixa"); 
     System.out.println("5 -Sair"); 

     System.out.println("Digite uma opcao:");
      opcao =teclado.nextInt();
      teclado.nextLine();
      
     switch (opcao) {
        case 1:
            System.out.println("digite o nome do cliente:");
            String nome = teclado.nextLine();
            
            System.out.println("digite o Cpf do cliente:");
            String cpf = teclado.nextLine();

            cliente.add(new Cliente(nome, cpf));
            break;

        case 2:

        for(int i = 0; i < cliente.size(); i++){
            System.out.println(i + "-" +  cliente.get(i).getNome());
        }

           System.out.println("digte  o idice do cliente:");
           int cid = teclado.nextInt();

           System.out.println("Digite o numero do qurto");
           int nQuarto = teclado.nextInt();


           System.out.println("Digite o numero do  diarias");
           int Ndiarias = teclado.nextInt();

           for(Quarto q : quantos){
             if (!q.getIsOcupado() && q.getNumero() == nQuarto ) {
                q.setIsOcupado(true);
                hospede.add(new Hospedagem(q,  cliente.get (cid), Ndiarias));
                System.out.println( "os pedagem criada com soucesso");
                break;
             }
           }
            
        case 3:
        case 4:
        case 5:
            System.out.println("fechar o Programa...");
            break;
        default:
            System.out.println("Opicao invalida!");
     }
   



    }while (opcao != 5);

}  
}
