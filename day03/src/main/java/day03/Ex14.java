package day03;


class Lec14 extends Thread{
	int begin;
	int end;
	static  int tot;
//	static volatile int tot;
	
	public Lec14(int begin,int end) {
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


public class Ex14{

	public static void main(String[] args) throws InterruptedException {
		Lec14 thr1=new Lec14(1, 500);
		Lec14 thr2=new Lec14(501,1000);
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println("tot:"+Lec14.tot);	///tot:500500
	}

}

