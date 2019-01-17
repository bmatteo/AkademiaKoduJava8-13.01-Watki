package pl.code.academy;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static Integer a = 5;

    public static void main(String[] args) {
        Watek watek = new Watek();
        Watek2 watek2 = new Watek2();
        //watek.start();
        //watek2.start();

        //new Thread(new WatekLepszy(1)).start();
        //new Thread(new WatekLepszy(2)).start();
        //new Thread(new WatekLepszy(3)).start();

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);

        //threadPool.schedule(new WatekSynch2(), 1, TimeUnit.SECONDS);
        threadPool.schedule(new WatekSynch(), 1, TimeUnit.SECONDS);
        threadPool.schedule(new WatekLepszy(3), 1, TimeUnit.SECONDS);

        threadPool.shutdown();
    }
}
