package day01;


class Lec23{
	int su1=1111;
	void func01() {
		System.out.println("부모기능"+su1);
	}
}

public class Ex23 extends Lec23{
	int su1=2222;
	void func01() {
		super.func01();
		System.out.println("자식기능"+super.su1);
	}
	void func02() {
		System.out.println("다른기능2");
	}

	public static void main(String[] args) {
		Lec23 me1=new Lec23();
		me1.func01();
		Ex23 me2=new Ex23();
		me2.func01();
		me2.func02();
		Lec23 me3=new Ex23();
		me3.func01();
		((Ex23)me3).func02();
		
	}

}
