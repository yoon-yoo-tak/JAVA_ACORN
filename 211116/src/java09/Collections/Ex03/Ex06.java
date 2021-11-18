package java09.Collections.Ex03;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
//		Set<String> hs = new HashSet<String>();
//		
//		
//		hs.add("test");
//		hs.add("hello");
//		
//		Iterator<String> itrt = hs.iterator();
//		while(itrt.hasNext())
//			System.out.println(itrt.next());
//		
//		hs.remove("test");
//		itrt = hs.iterator();
//		while(itrt.hasNext())
//			System.out.println(itrt.next());
		int n  = 6;
		int[] arr1 = {46, 33 , 33, 22, 31, 50};
		int[] arr2 = {27,56,19,14,14,10};
		String[] ans = new String[n];
		for(int i=0; i<5;i++) {
			ans[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			String.format("%" + n + "s", ans[i]);
			ans[i] = ans[i].replaceAll("1", "#");
			ans[i] = ans[i].replaceAll("0", " ");
			
			
		}
		for(int i = 0 ; i <ans.length;i++) {
			System.out.println(ans[i]);
		}
		
	}

}
