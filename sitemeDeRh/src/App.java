public class App {
    public static void main(String[] args) throws Exception {

        SistemaDeRh f1 = new SistemaDeRh();

        f1.nome = "ana";
        f1.salario = 2500.0;

        SistemaDeRh f2 = new SistemaDeRh();

        f2.nome = "carlos";
        f2.salario = 1500.0;


        f1.receberAumento(500);
        System.out.println("almentodo de salario" + f1.salario);

        f2.receberAumento(700);
        System.out.println("almento de salario" + f2.salario);

    }

}
