public class App {
    public static void main(String[] args) throws Exception {
        MaquinaDeCafe mc = new MaquinaDeCafe();

        mc.fazerCafe();
        mc.recaregar(4);

        mc.fazerCafe();
        mc.fazerCafe();
        mc.fazerCafe();
        mc.fazerCafe();

    }
}
