package day03;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex42 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Long running task simulation
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        }, executor);  // 스레드 풀을 사용

        // Block and get the result of the Future
        String result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}

