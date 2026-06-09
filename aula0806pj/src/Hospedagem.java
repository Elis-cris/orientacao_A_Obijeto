public class Hospedagem {
    protected Quarto quarto;
    protected Cliente hospode;
    protected int diarias;
    protected boolean isAtiva;
    protected double valorTotal;

    public Hospedagem(Quarto q, Cliente h, int d) {
        this.quarto = q;
        this.hospode = h;
        this.diarias = d;
        this.isAtiva = true;
        this.valorTotal = 0.0;
    }

    public Quarto getQarto() {
        return this.quarto;
    }

    public Cliente getCliente() {
        return this.hospode;
    }

    public int getDiarias() {
        return this.diarias;
    }

    public boolean getIsAtiva() {
        return this.isAtiva;
    }
    
    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setIsAtivas(boolean status) {
        this.isAtiva = status;
    }

    public void setValorTotal(double v) {
        this.valorTotal = v;
    }

}
