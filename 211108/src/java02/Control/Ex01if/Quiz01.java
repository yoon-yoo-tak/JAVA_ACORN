package java02.Control.Ex01if;

import java.util.Scanner;

public class Quiz01 {
// 1. 세 수를 입력받아 큰 수를 출력하시오.
	public static void main(String[] args) {
//		데이터 입력 시 Scanner [인스턴스명] = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.println("수를 입력하세요?");
		int num1 = in.nextInt();
		System.out.println("수를 입력하세요?");
		int num2 = in.nextInt();
		System.out.println("수를 입력하세요?");
		int num3 = in.nextInt();
		
		System.out.println("입력 바은 세 수 중 큰 수 처리 중...");
		int max = 0;
		if(num1>num2) max = num1;
		else          max = num2;
		if(max<num3) max = num3;
		System.out.println("최대값 : " + max);
	}

}
