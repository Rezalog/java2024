package day02;

import java.util.stream.Stream;

public class Ex74 {

	public static void main(String[] args) {
		Stream.of("item1","item2","item3","item4","item5")
		.forEach(e->System.out.println(e));

		Stream.of("item1","item2","item3","item4","item5")
		.peek(e->System.out.println(e))
		.toList()
		;
	}

}
