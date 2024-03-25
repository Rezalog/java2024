package day01;


class Lec24{
	
	public Lec24() {
		super();
	}
	
	void func01() {
		System.out.println("부모기능");
	}
}

public class Ex24 extends Lec24 {

	public Ex24(){
		super();
	}
	
	public Ex24(int a) {
		this();
	}
	public Ex24(double a) {
		this();
	}

	public static void main(String[] args) {
		Ex24 me=new Ex24();
		me.func01();
	}

}
