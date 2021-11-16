package java09.Collections.Ex02;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test");
		lst.add("Hello");
		lst.add(1,"one");
		
		for(int i = 0 ; i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		if(lst.isEmpty())
			System.out.println("clear");
		
		System.out.println("전체 삭제");
		
		lst.clear();
		System.out.println(lst.size());
		
		if(lst.isEmpty())
			System.out.println("clear");
		
		
	}
}
