package day03;

public class Ex10 {
    public static void main(String[] args) {
        // 스레드 생성
        Thread thread = new Thread(() -> {
            try {
                // 스레드를 1초간 대기
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // 스레드 상태 출력
        System.out.println("Before start: " + thread.getState());

        // 스레드 시작
        thread.start();

        // 스레드 상태 출력
        System.out.println("After start: " + thread.getState());

        // 스레드가 종료될 때까지 대기
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // 스레드 상태 출력
        System.out.println("After join: " + thread.getState());
    }
}

