package pl.code.academy;

public class WatekLepszy implements Runnable {

    int threadNumber;

    public WatekLepszy(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i ++) {
            System.out.println("Jestem wątekRunnable" + this.threadNumber + ": " + i + " " + Main.a);
        }
    }
}
