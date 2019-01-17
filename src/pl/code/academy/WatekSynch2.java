package pl.code.academy;

public class WatekSynch2 implements Runnable {
    @Override
    public void run() {
        synchronized (Main.a) {

            Main.a = 10;
            System.out.println(Main.a + " Watek2");

            for (int i = 0; i < 10000; i++) {
                System.out.println("Jestem watek2: " + i);
            }
        }
    }
}
