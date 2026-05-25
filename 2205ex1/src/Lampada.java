public class Lampada {
    private boolean ligada;
    private String cor;

    public Lampada(String corInicial) {
        this.cor = corInicial;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void imprimirStatus() {
        if (this.ligada == true) {
            System.out.println("Ligada!");
        } else {
            System.out.println("Desligada!");
        }
        System.out.println("Cor:" + this.cor);
    }

}
