package day03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Lec17 extends Thread{
	int begin;
	int end;
	static int tot;
	private final Lock lock;
	
	public Lec17(int begin,int end, Lock lock) {
		this.begin=begin;
		this.end=end;
		this.lock=lock;
	}
	
	public void plus(int su) {
		try {
			lock.lock();
			tot=tot+su;
		} finally {
	      lock.unlock();
	    }
	}
	
	@Override
	public void run() {
		for(int i=begin; i<=end; i++) {
			plus(i);
		}
		System.out.println(this.getName()+": end");
	}
}


public class Ex17{

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		Lec17 thr1=new Lec17(1, 500,lock);
		Lec17 thr2=new Lec17(501,1000,lock);
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println("tot:"+Lec17.tot);	///tot:500500
	}

}

