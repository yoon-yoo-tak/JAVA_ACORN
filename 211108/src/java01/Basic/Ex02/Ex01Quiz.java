package java01.Basic.Ex02;

import java.util.Scanner;

public class Ex01Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요?");
		String name = in.next();
		in.close();
		System.out.println(name);
	}

}
