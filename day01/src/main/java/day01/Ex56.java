package day01;

interface Inter2
{
void func();	
}

public class Ex56 {
	static Inter2 obj=new Inter2() {
		public void func() {
			System.out.println("기능구현");
		}
	};

	public static void main(String[] args) {
		Ex56.obj.func();
	}

}
