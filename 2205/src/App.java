public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta("Elis");

        double saldo = conta1.getSaldo();
        System.out.println("Saldo atual:" + saldo);

        conta1.depositar(200.0);
        saldo = conta1.getSaldo();
        System.out.println("saido atual:" + saldo);

        conta1.sacar(500);
        saldo = conta1.getSaldo();
        System.out.println(" saldo atual: " + saldo);

        conta1.sacar(50.0);
        saldo = conta1.getSaldo();
        System.out.println(" saldo autal:" + saldo);

    }
}
