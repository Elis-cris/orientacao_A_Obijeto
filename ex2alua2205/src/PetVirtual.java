public class PetVirtual {
    private String nome;
    private int energia;

    public PetVirtual(String nomePet) {
        this.nome = nomePet;
        this.energia = 100;
    }

    public void brincar() {
        if (this.energia > 0) {
            this.energia = this.energia - 20;
            System.out.println("O prt brincou");
        } else {
            System.out.println("o pet Esta muito cansado para brincar");

        }

    }

    public void domir() {
        this.energia = 100;
        System.out.println("o pet  descansou");

    }

}
