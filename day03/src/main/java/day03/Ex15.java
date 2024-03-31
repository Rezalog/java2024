package day03;


class Lec15 extends Thread{
	int begin;
	int end;
	static int tot;
	
	public Lec15(int begin,int end) {
		this.begin=begin;
		this.end=end;
	}
	
	public static synchronized void plus(int su) {
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


public class Ex15{

	public static void main(String[] args) throws InterruptedException {
		Lec15 thr1=new Lec15(1, 500);
		Lec15 thr2=new Lec15(501,1000);
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println("tot:"+Lec15.tot);	///tot:500500
	}

}

