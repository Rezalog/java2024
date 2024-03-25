package day02;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex22 {
    public static void main(String[] args) {
        		List list=new Vector();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);

//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		Enumeration enu=((Vector)list).elements();
//		while(enu.hasMoreElements())
//			System.out.println(enu.nextElement());
		
		Iterator ite=((Vector)list).iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
    }
}
