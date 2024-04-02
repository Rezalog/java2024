package day02;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Ex80 {

	public static void main(String[] args) {
		String string = "a string in optional";
		Optional<String> opString = Optional.of(string);
		System.out.println(opString.get());
		// Optional.of(null) 불가
		String nullString = null;
		Optional<String> nullOpString = Optional.ofNullable(nullString);
		Optional<String> emptyOptional = Optional.empty();
		try {
		System.out.println(nullOpString.get());
		} catch (NoSuchElementException e) {
		System.out.println("No such element");
		}
		System.out.println(emptyOptional.isPresent()!=true);
		emptyOptional.ifPresent(e->System.out.println(e));
		emptyOptional.ifPresentOrElse(e->System.out.println(e), ()->System.out.println("널임"));
		opString.ifPresent(e->System.out.println(e));
		opString.ifPresentOrElse(e->System.out.println(e), ()->System.out.println("널임"));
	}

}
