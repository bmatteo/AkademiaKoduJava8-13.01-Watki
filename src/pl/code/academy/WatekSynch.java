package pl.code.academy;

public class WatekSynch implements Runnable {
    @Override
    public void run() {
        synchronized (Main.a) {
            int temp = Main.a;

            temp += 3;
            Main.a = temp;
            System.out.println(Main.a + " Watek1");

            for (int i = 0; i < 10000; i++) {
                System.out.println("Jestem watek: " + i);
            }
        }
    }
}
