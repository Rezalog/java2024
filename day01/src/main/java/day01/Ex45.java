package day01;

class MyErr extends Exception{
	MyErr(){
		super("내가 정한 메시지");
	}
}

public class Ex45 {

	public static void main(String[] args) {
		try {
		    func(4,0);
        } catch (MyErr e) {
            System.out.println(e.getMessage());
        } catch (java.lang.ArithmeticException e) {
                System.out.println("던진 에러받아서 처리");
        // }catch (Exception e) {
        //     e.printStackTrace();
		}
	}
	
	public static void func(int a, int b) throws MyErr{
		if(a/b==1) {
			MyErr err=new MyErr();
			throw err;
		}
		int su=a/b;
		
	}

}
