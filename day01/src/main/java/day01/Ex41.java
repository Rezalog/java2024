package day01;

public class Ex41 {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		
		for(int i=0; i<3; i++) {
			try {
			System.out.println(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("에러 잡음");
			}
		}

	}

}
