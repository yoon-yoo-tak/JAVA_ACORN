package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		
		int visit = sc.nextInt();
		sc.close();
		if(visit <1) {
			System.out.println("첫 방문 감사합니다.");
		}else {
			System.out.println("재 방문 감사합니다.");
		}
	}
}
