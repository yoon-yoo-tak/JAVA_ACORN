package java09.Collections.Ex03;


import java.util.*;
/*
 * hashmap�� Key�� value�� ���ȴ�.
 * Key�� set�������� �������� ������
 * value�� �ߺ��Ǿ �������.
 */

public class Ex08 {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("zero", "test");
		hm.put("one", "hello");
		hm.put("one", "change");
		
		Set<String> ks = hm.keySet();
		for(String key : ks)
			System.out.println(key + " : " + hm.get(key) );
	}

}
