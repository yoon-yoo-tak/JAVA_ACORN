package java09.Collections.Ex02;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
//		List�� �������̽��̰� <>���� ������ �ڷ����̴�.
//		List<String> lst = new ArrayList<String>();
		List<String> lst = new LinkedList<String>();
		
//		������ �߰�
		lst.add("test");
		lst.add("Hello");
		
//		������ ���
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst);
	}
}
