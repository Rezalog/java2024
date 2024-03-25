package day03;
//PipedThreads
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

class MyThread extends Thread {
    private PipedReader pr;
    private PipedWriter pw;

    MyThread(String name, PipedReader pr, PipedWriter pw) {
        super(name);
        this.pr = pr;
        this.pw = pw;
    }

    @Override
    public void run() {
        try {
            if (getName().equals("Thread 1")) {
                for (int cnt = 0; cnt < 15; cnt++) {
                    pw.write("Thread 1" + cnt + "\n");
                }
                pw.close();
            } else {
                int item;
                while ((item = pr.read()) != -1) {
                    System.out.print((char) item);
                }
                pr.close();
            }
        } catch (IOException e) {
        }
    }
}

public class Ex21 {
    public static void main(String[] args) throws Exception {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);

        MyThread mt1 = new MyThread("Thread 1", pr, pw);
        MyThread mt2 = new MyThread("Thread 2", pr, pw);

        mt1.start();
        Thread.sleep(2000);
        mt2.start();
    }
}

