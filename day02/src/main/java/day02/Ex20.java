package day02;


import java.util.*;
//class Lec20{}
class Lec20 implements Comparable{
	int val;
	
	public Lec20(int su) {
		val=su;
	}
	@Override
	public int compareTo(Object o) {
		return ((Lec20)o).val-val;
	}
	@Override
	public String toString() {
		return ""+val;
	}
	
}

public class Ex20 {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add(new Lec20(1111));
		set.add(new Lec20(4444));
		set.add(new Lec20(3333));
		set.add(new Lec20(2222));
		set.add(new Lec20(3333));
		
		Iterator ite=set.iterator();
		while(ite.hasNext()) {
			Object obj=ite.next();
			System.out.println(obj.toString());
		}
	}

}
