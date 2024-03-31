package day03;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyRunnable implements Runnable {
    private final long waitTime;

    public MyRunnable(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(waitTime);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Ex51 {
    public static void main(String[] args) {
        MyRunnable myrunnableobject1 = new MyRunnable(1000);
        MyRunnable myrunnableobject2 = new MyRunnable(2000);

        FutureTask<String> futureTask1 = new FutureTask<>(myrunnableobject1, "FutureTask1 is complete");
        FutureTask<String> futureTask2 = new FutureTask<>(myrunnableobject2, "FutureTask2 is complete");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(futureTask1);
        executor.submit(futureTask2);

        while (true) {
            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Both FutureTask Complete");
                    executor.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {
                    System.out.println("FutureTask1 output = " + futureTask1.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");
                String s = futureTask2.get(250, TimeUnit.MILLISECONDS);
                if (s != null) {
                    System.out.println("FutureTask2 output = " + s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

