package day02;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex75 {

	public static void main(String[] args) {
		long su = Stream.of("item1","item2","item3","item4","item5")
		.count();
		System.out.println(su);
		Optional<String> op = Stream.of("item1","item2","item3","item4","item5")
		.max(Comparator.naturalOrder());
		System.out.println(op.get());
		Optional<String> op2 = Stream.of("item1","item2","item3","item4","item5")
		.max(Comparator.reverseOrder());
		System.out.println(op2.get());
		
	}

}
