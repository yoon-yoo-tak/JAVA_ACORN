package java04.application02.Authentication;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int n = in.nextInt();
		int authnum = getCertiNum(n);
		System.out.println("입력값 : " + n);
		System.out.println("인증번호 : " + authnum);
	}

	private static int getCertiNum(int i) {
		int certiNum = i*10;
		//메소드가 실행한 후 전달할 값 지정
		return certiNum;
	}

}
