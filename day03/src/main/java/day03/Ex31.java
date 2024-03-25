package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex31 {
    public static void main(String[] args) {
        // 스레드풀 생성: 10개의 스레드를 유지하는 고정된 스레드풀
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // 100개의 작업을 스레드풀에 제출
        for (int i = 0; i < 100; i++) {
            executor.submit(new Task(i));
        }

        // 스레드풀 종료 요청
        executor.shutdown();
        try {
            // 모든 작업이 완료될 때까지 대기
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        // 작업 내용
        System.out.println("Task ID : " + this.taskId + " performed by " 
                           + Thread.currentThread().getName());
    }
}

