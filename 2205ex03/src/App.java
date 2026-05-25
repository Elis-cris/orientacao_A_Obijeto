public class App {
    public static void main(String[] args) throws Exception {
        Arcondicionado ac = new Arcondicionado("LG");

        ac.almentarTemperatura();

        ac.ligar();

        ac.almentarTemperatura();
        ac.almentarTemperatura();

        ac.diminur();

        ac.desligar();

    }
}
