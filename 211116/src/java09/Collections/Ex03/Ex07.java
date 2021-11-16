package java09.Collections.Ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		String[] words = {"java","microsoft","chrome","eclipse","linux"};
		
		Random rand = new Random(words.length);
		
		
		for(int i = 0 ; i<words.length;i++) {
			String word = words[rand.nextInt(words.length)];
			hs.add(word);
			System.out.println(word);
		}
		
		System.out.println("====================");
		
		for(String str : hs)
			System.out.println(str);
		
	}

}
