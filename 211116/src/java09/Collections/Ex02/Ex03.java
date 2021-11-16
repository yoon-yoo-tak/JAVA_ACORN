package java09.Collections.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test");
		lst.add("Hello");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst);
	}

}
