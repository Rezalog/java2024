package day03;

import java.util.concurrent.CompletableFuture;

public class Ex41 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Long running task simulation
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        });

        // Block and get the result of the Future
        String result = future.get();
        System.out.println(result);
    }
}

