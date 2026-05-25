public class App {
    public static void main(String[] args) throws Exception {
        Lampada lampada1 = new Lampada("azul");

        lampada1.ligar();
        lampada1.imprimirStatus();

        lampada1.desligar();
        lampada1.imprimirStatus();

        lampada1.imprimirStatus();

    }
}
