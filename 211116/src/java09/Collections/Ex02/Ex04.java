package java09.Collections.Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex04 {

	public static void main(String[] args) {
		String[] words = {"��","����","���","����","���³�"};
		
//		���� ������ ArrayList�� �����ϰ� �����Ͽ� ����� ����Ͻÿ�.
		
		ArrayList<String> rand_word = new ArrayList<String>();
		for(int i = 0 ; i <words.length;i++) {
			rand_word.add(words[i]);
		}
		Collections.shuffle(rand_word);
		System.out.println(rand_word);
		
		
	}

}
