package day01;


// 추상 클래스 - 추상메서드를 0개 이상 갖는 클래스
abstract class Lec31{
	int su1=1111;
	
	public Lec31(int su1) {
		this.su1=su1;
	}
	
	abstract void func01();	//추상메서드
	
	public void func02() {}
}

public class Ex31 extends Lec31 {
	
	public Ex31() {
		super(1234);
	}
	void func01() {
		System.out.println("부모의 기능을 오버라이드..");
	}

	public static void main(String[] args) {
		// Lec31 you=new Lec31();
		Ex31 me=new Ex31();
		me.func01();
		Lec31 you=new Ex31();
		you.func01();
	}

}
