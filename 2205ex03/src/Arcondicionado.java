public class Arcondicionado {

    private String marca;
    private int temperatura;
    private boolean status;

    public Arcondicionado(String marca) {
        this.marca = marca;
        this.temperatura = 24;
        this.status = false;

    }

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public void almentarTemperatura() {
        if (this.status == true) {

            if (this.temperatura < 30) {
                this.temperatura++;
                System.out.println("temperatura aumentada ");
            } else {
                System.out.println("temperatura maxima!");
            }
        } else {
            System.out.println("O ar esta ligado !");
        }

    }

    public void diminur() {
        if (this.status == true) {

            if (this.temperatura > 16) {
                this.temperatura--;
                System.out.println("temperatura diminuida ");
            } else {
                System.out.println("temperatura minima!");
            }
        } else {
            System.out.println("O ar esta ligado !");
        }

    }
}
