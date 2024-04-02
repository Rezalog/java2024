package day02;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex78 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("item1","item2","item3","item2","item5");
		List<String> arr1 = stream.collect(Collectors.toList());
		System.out.println(arr1);
		Stream<String> stream2 = Stream.of("item1","item2","item3","item2","item5");
		Set<String> set1 = stream2.collect(Collectors.toSet());
		System.out.println(set1);

		Stream<String> stream3 = Stream.of("item1","item2","item3","item2","item5");
		Map<Object, Object> map1 = stream3.distinct()
									.collect(Collectors.toMap(e->e+"key", e->e));
		System.out.println(map1);
		
		Stream<String> stream4 = Stream.of("item1","item2","item3","item2","item5");
		IntSummaryStatistics su = stream4.collect(Collectors.summarizingInt(e->{
									String temp=e.replace("item", "");
									return Integer.parseInt(temp);
									}));
		System.out.println(su);
		System.out.println(su.getAverage());
	}

}
