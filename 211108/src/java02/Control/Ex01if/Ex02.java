package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		
		int visit = sc.nextInt();
		sc.close();
		if(visit <1) {
			System.out.println("ù �湮 �����մϴ�.");
		}else {
			System.out.println("�� �湮 �����մϴ�.");
		}
	}
}
