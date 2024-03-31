package day03;

//Lock-Free 동기화 기법
import java.util.concurrent.locks.LockSupport;

class Lec19 implements Runnable{
    int cnt=1;
    boolean running;
    boolean wating;

    Lec19(){
        running=true;
        wating=false;
    }

    @Override
    public void run() {
        while(running){
            System.out.println("running.."+cnt++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(wating) LockSupport.park();
        }
    }

}

public class Ex19 {
    public static void main(String[] args) throws InterruptedException{
        Lec19 target=new Lec19();

        Thread thread=new Thread(target);
        thread.start();
        Thread.sleep(5000);
        target.wating=true;
        Thread.sleep(5000);
        target.wating=false;
        LockSupport.unpark(thread);
        Thread.sleep(5000);
        target.wating=true;
        Thread.sleep(5000);
        target.running=!target.running;
        LockSupport.unpark(thread);
    }
}
