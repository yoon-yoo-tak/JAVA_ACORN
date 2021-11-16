package java09.Collections.Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		String[] words = {"꿈","나무","어린이","좋아","쉬는날"};
		List<String> lst = new ArrayList<String>();
		Random rand = new Random();
		
		for(int i = 0 ; i<words.length;i++) {
			lst.add(words[rand.nextInt(words.length)]);
		}
		
		for(int i = 0 ; i<words.length;i++)
			System.out.println(lst.get(i) + " ");
		System.out.println("\n============ Sroted ============");
		lst.sort(null);
		for(int i = 0 ; i < words.length;i++) {
			System.out.println(lst.get(i)+ " ");
		}
		
	}
}
