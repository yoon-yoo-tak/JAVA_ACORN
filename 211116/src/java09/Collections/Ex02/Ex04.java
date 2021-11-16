package java09.Collections.Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex04 {

	public static void main(String[] args) {
		String[] words = {"꿈","나무","어린이","좋아","쉬는날"};
		
//		위의 정보를 ArrayList에 랜덤하게 저장하여 결과를 출력하시오.
		
		ArrayList<String> rand_word = new ArrayList<String>();
		for(int i = 0 ; i <words.length;i++) {
			rand_word.add(words[i]);
		}
		Collections.shuffle(rand_word);
		System.out.println(rand_word);
		
		
	}

}
