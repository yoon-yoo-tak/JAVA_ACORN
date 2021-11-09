package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex04quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("수를 입력하세요");
		int b = sc.nextInt();
		sc.close();
		System.out.println("큰 수 : " + ((a>b)?a:b));
		
	}

}
