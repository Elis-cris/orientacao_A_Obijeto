public class Cliente {

    protected String nome;
    protected String cpf;

    public Cliente(String n, String c) {
        this.nome = n;
        this.cpf = c;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;

    }

    
}
