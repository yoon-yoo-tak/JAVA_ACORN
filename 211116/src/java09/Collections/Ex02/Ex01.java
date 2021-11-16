package java09.Collections.Ex02;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
//		List는 인터페이스이고 <>안은 저장할 자료형이다.
//		List<String> lst = new ArrayList<String>();
		List<String> lst = new LinkedList<String>();
		
//		데이터 추가
		lst.add("test");
		lst.add("Hello");
		
//		데이터 얻기
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst);
	}
}
