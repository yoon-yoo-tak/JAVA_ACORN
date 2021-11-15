package java04.application02.Authentication;

import java.util.Scanner;

public class Ex01Quiz {

	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		getNum(N);
	}

	private static void getNum(int N) {
		int Num = (int)(Math.random()*10000);
		int length = (int)(Math.log10(Num)+1);
		if(N>length) {
			System.out.println("잘못된 수 입력.");
		}else {
			if(length == N) {
			System.out.println(Num);
			}else {
				Num = (int)(Math.random()*10000);
				getNum(N);
			}
		}
	}
}
