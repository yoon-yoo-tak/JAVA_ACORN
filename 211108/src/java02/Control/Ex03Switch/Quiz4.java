package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		final int MAXSEC = 230;
//		2. 초를 입력받기(기존 시간보다 큰 시간이면 재입력 요구)		
		Scanner in = new Scanner(System.in);

		int sec = 0;
		
		for(;;) {
			System.out.println("플레이된 초를 입력하세요?");
			
			sec = in.nextInt();
			if(sec<MAXSEC) {
				break;
			}
			System.out.println("노래보다 긴 시간을 입력했습니다.");
			System.out.print("다시 ");
		}
		
		System.out.println((sec*100/MAXSEC)+"%");
	}

}
