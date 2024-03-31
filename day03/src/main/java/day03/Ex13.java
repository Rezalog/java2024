package day03;

class Lec13 extends Thread{
	int begin;
	int end;
	static  int tot;
//	static volatile int tot;
	
	public Lec13(int begin,int end) {
		this.begin=begin;
		this.end=end;
	}
	
	public static void plus(int su) {
			tot=tot+su;
	}
	
	@Override
	public void run() {
		for(int i=begin; i<=end; i++) {
			plus(i);
		}
		System.out.println(this.getName()+": end");
	}
}


public class Ex13{

	public static void main(String[] args) throws InterruptedException {
		Lec13 thr1=new Lec13(1, 500);
		Lec13 thr2=new Lec13(501,1000);
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println("tot:"+Lec13.tot);	///tot:500500
	}

}

