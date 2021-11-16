package java09.Collections.Ex03;


import java.util.*;
/*
 * hashmap은 Key와 value로 사용된다.
 * Key는 set형식으로 고유값을 갖으며
 * value는 중복되어도 상관없다.
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
