package day02;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex79 {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("item1","item2","item3","item2","item5");
		String msg = stream1.collect(Collectors.joining());
		System.out.println(msg);
		Stream<String> stream2 = Stream.of("item1","item2","item3","item2","item5");
		String msg2 = stream2.collect(Collectors.joining(","));
		System.out.println(msg2);
		Stream<String> stream3 = Stream.of("item1","item2","item3","item2","item5");
		String msg3 = stream3.collect(Collectors.joining(",","<",">"));
		System.out.println(msg3);
	}

}
