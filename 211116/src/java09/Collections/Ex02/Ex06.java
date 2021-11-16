package java09.Collections.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		
		hs.add("test");
		hs.add("hello");
		
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
		hs.remove("test");
		itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
	}

}
