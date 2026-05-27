public class Conta {

    protected int numero;
    protected double saldo;

    public Conta(int n, double s) {
        this.numero = n;
        this.saldo = s;

    }

    public void cobrarTarifa() {
        this.saldo = this.saldo - 15;
    }

}
