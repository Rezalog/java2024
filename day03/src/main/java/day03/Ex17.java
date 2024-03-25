package day03;

class SharedArea {
    private int counter = 0;
    private boolean available = false;

    public synchronized int getCounter() {
        // 스레드가 counter 값을 요청할 때, 값이 설정되지 않았다면 대기
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false; // 값을 가져갔으니 다시 false로 설정
        notifyAll(); // 다른 스레드에게 counter 사용 가능함을 알림
        return counter;
    }

    public synchronized void setCounter(int value) {
        // 스레드가 counter 값을 설정할 때, 이전 값이 아직 사용 중이라면 대기
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        counter = value;
        available = true; // 새 값이 설정되었으니 true로 설정
        notifyAll(); // 다른 스레드에게 새 값이 설정됨을 알림
    }
}

class ProducerThread extends Thread {
    private SharedArea sharedArea;

    public ProducerThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedArea.setCounter(i);
            System.out.println("생산자: " + i + " 설정");
        }
    }
}

class ConsumerThread extends Thread {
    private SharedArea sharedArea;

    public ConsumerThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = sharedArea.getCounter();
            System.out.println("소비자: " + value + " 가져옴");
        }
    }
}

public class Ex17 {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();
        Thread producer = new ProducerThread(sharedArea);
        Thread consumer = new ConsumerThread(sharedArea);

        producer.start();
        consumer.start();
    }
}

