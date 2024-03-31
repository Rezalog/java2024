package day03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex32 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

        service.schedule(()->System.out.println("scheduling..."), 10L, TimeUnit.SECONDS);
        service.shutdown();
    }
}
