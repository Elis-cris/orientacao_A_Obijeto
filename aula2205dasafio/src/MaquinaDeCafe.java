public class MaquinaDeCafe {
    private int capsulasDisponivel;

    public MaquinaDeCafe() {
        this.capsulasDisponivel = 0;
    }

    public void recaregar(int quantidade) {
        this.capsulasDisponivel = this.capsulasDisponivel + quantidade;
        System.out.println("Maquina recarregada!");
    }

    public void fazerCafe() {
        if (this.capsulasDisponivel >= 1) {
            this.capsulasDisponivel = this.capsulasDisponivel - 1;
            System.out.println("Café pronto!");
        } else {
            System.out.println("Erro: maquina vazia. Recaregar ");
        }
    }
}
