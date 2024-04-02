package day02;

import java.util.Optional;
import java.util.stream.Stream;

public class Ex77 {

	public static void main(String[] args) {
		Optional op1=
				Stream.of("item1","item2","item3","item4","item5")
				.reduce((a,b)->{
					System.out.println("a=%s,b=%s".formatted(a,b));
					return a+b;
				});
				System.out.println(op1.get());
		System.out.println("---------------------");
		String op2=
				Stream.of("item1","item2","item3","item4","item5")
				.reduce("op2=",(a,b)->{
					System.out.println("a=%s,b=%s".formatted(a,b));
					return a+b;
				});
				System.out.println(op2);
		
	}

}
