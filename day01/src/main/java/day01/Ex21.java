package day01;

// 다중상속을 지원하지 않습니다
class Lec20{}
// 부모클래스, super class
class Lec21 extends Object{
	int su1=1111;
	void func01() {
		System.out.println("부모기능");
	}
}
// 자식클래스, sub class
public class Ex21 extends Lec21{
	
	void func02() {
		System.out.println("자식클래스의 기능");
	}

	public static void main(String[] args) {
		Ex21 me=new Ex21();
		System.out.println(me.su1);
		me.func01();
	}

}
