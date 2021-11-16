package java09.Collections.Ex01;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test");
		lst.add("Hello");
		lst.add(1,"one");
		
		for(int i = 0 ; i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		System.out.println("Á¦°Å");
		lst.remove(2);
		for(int i = 0 ; i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
