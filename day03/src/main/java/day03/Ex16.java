package day03;


class Lec16 extends Thread{
	int begin;
	int end;
	static int tot;
	static Object key=new Object();
	
	public Lec16(int begin,int end) {
		this.begin=begin;
		this.end=end;
	}
	
	public static synchronized void plus(int su) {
		
//		synchronized (key) {
			tot=tot+su;
//		}
		
	}
	
	@Override
	public void run() {
		for(int i=begin; i<=end; i++) {
			plus(i);
		}
		System.out.println(this.getName()+": end");
	}
}


public class Ex16{

	public static void main(String[] args) throws InterruptedException {
		Lec16 thr1=new Lec16(1, 500);
		Lec16 thr2=new Lec16(501,1000);
		thr1.start();
		thr2.start();
		Thread.sleep(5000);
		System.out.println("tot:"+Lec16.tot);	///tot:500500
	}

}

