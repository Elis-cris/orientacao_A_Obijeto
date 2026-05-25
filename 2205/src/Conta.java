public class Conta {

    private String titular;
    private double saldo;

    public Conta(String nomeTilular) {
        this.titular = nomeTilular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDepositado) {
        this.saldo = this.saldo + valorDepositado;
    }

    public void sacar(double valorSacado) {
        if (this.saldo >= valorSacado) {
            this.saldo = this.saldo + valorSacado;
            System.out.println("saque ralizado!");
        } else {
            System.out.println("saldo insuficiente!");
        }

    }

}
