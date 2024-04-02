package day02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex91 {

	public static void main(String[] args) {
		String msg="abcd";
		Consumer con1=(e)->System.out.println(e);
		con1.accept("abcd");
		Consumer con2=System.out::println;
		con2.accept("ABCD");
		Function con3=String::valueOf;
		
		Supplier fun1=msg::length;
		Supplier fun2=msg::toUpperCase;
		
		Supplier new1 = ()->new String();
		System.out.println(new1.get().getClass());
		Supplier new2=String::new;
		System.out.println(new2.get().getClass());
		
	}

}
