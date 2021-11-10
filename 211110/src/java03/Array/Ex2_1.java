package java03.Array;

import java.util.HashSet;
import java.util.Set;

public class Ex2_1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) { 
			int d = (int)(Math.random() * 45) + 1;
			set.add(d);
		} 
		System.out.println(set);
	}
}
