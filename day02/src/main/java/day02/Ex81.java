package day02;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex81 {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1111,2222,3333,4444);
		Map<Object, List<Integer>> g1 = stream1.collect(Collectors.groupingBy(e->e%2));
		System.out.println(g1);
		Stream<Integer> stream2 = Stream.of(1111,2222,3333,4444);
		Map<Object, List<Integer>> g2 = stream2.collect(Collectors.groupingBy(e->e>3000));
		System.out.println(g2);
	}

}
