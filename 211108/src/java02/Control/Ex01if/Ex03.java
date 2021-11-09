package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visit = in.nextInt();
		in.close();
		String vis = "첫";
		if(visit>1) {
			vis = "재";
		}
	System.out.println(vis + "방문 감사합니다.");
	}

}

// 두 수를 입력받아 큰 수를 출력하시오.