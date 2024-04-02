package day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex76 {

	public static void main(String[] args) {
		 IntStream suStream1 = Stream.of(1111,2222,3333,4444)
			.mapToInt(e->e.intValue())
			;
		 int sum1 = suStream1.sum();
		 System.out.println(sum1);
		 IntStream suStream2 = IntStream.of(11,22,33,44,55);
		 Stream<Integer> suStream3 = suStream2.boxed();
		 IntStream suStream4 = suStream3.mapToInt(e->e);
//		 OptionalDouble op2 = suStream4.average();
//		 System.out.println(op2.getAsDouble());
		 int[] arr = suStream4.toArray();
		 System.out.println(Arrays.toString(arr));
	}

}
