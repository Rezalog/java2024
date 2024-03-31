package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex31 {
    public static void main(String[] args) {
        // 스레드풀 생성: 10개의 스레드를 유지하는 고정된 스레드풀,Queue에서 작업이 대기
        // ExecutorService executor = Executors.newFixedThreadPool(10);
        // Thread 갯수가 1개로 고정되어있는 Thread Pool
        //ExecutorService executor = Executors.newSingleThreadExecutor();
        // Thread의 갯수를 정하지 않고 상황에 따라서 생성 및 해제하는 Thread Pool,유휴시간(기본 값 60초)이 지나면 Thread Pool에서 사용하지 않는 Thread는 해제
        ExecutorService executor = Executors.newCachedThreadPool();

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

