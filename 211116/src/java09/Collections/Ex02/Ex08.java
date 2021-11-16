package java09.Collections.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex08 {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
		
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
		
		System.out.println("====================");
//		descendingIterator : 내림차순으로 정렬
		Iterator<String> it = hs.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
