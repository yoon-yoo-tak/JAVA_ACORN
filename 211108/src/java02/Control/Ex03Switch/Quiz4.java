package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		final int MAXSEC = 230;
		
//		초를 입력받기(기존 시간보다 큰 시간이면 재입력 요구)		
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

		
		int percent = sec*100/MAXSEC;
		String progress = "";
		int blockCnt = percent/10;
		for(int i=0; i<blockCnt;i++) 
			progress += "■";
		
//		%02d > 2자리 공간을 확보하고 유효숫자가 아닌 부분은 0으로 출력
		progress += String.format("%02d", percent)+"%";
		
		System.out.println("┌──────────┐");
		System.out.print("│");
		System.out.print(progress);
		for(int i=3+blockCnt;i<10;i++) {
			System.out.print("   ");
		}
		if(blockCnt<8) {
			System.out.println("│");
		}
		System.out.println("\n└──────────┘");
		
	}

}
