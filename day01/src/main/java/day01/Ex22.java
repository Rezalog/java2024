package day01;


class Lec04{
	int su1=1111;
	public void func01() {
		System.out.println("root 기능");
	}
}
class Lec44 extends Lec04{}
class Lec444 extends Lec04{}

public class Ex22 extends Lec04{
	int su1=2222;

	//메서드 오버라이드 - 메서드만 - 부모의 기능을 자식을 재작성
	// 접근제한자는 같거나 보다 열리는 방향으로만 허용
	@Override
	public void func01() {
		System.out.println("sub function...");
	}
	
	public String toString() {
		return "나야나";
	}
	public boolean equals(Object obj) {
		return 0==this.su-((Ex22)obj).su;
	}
	
	int su;
	public Ex22(int su) {
		this.su=su;
	}
	public static void main(String[] args) {
		Ex22 me=new Ex22(1);
		Ex22 you=new Ex22(2);
//		me.func01();
//		System.out.println(me.su1);
//		System.out.println(me==you);
		System.out.println(me.equals((Object)you));
	}

}
