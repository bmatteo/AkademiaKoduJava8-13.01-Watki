package pl.code.academy;

public class Watek extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Jestem watek1: " + i);
        }
    }
}
