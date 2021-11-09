package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totaltime = 230; // 음악길이
		int N;
//		System.out.println("초를 입력하세요?");
//		int N = sc.nextInt();
		for(;;) {
			System.out.println("플레이된 초를 입력하세요?");
			
			N = sc.nextInt();
			if(N<=totaltime) {
				break;
			}
			System.out.println("노래보다 긴 시간을 입력했습니다.");
			System.out.print("다시 ");
		}
		
		double percent = (double)N/(double)totaltime*100; // 퍼센트값
		
		String s  = "│";
		
		System.out.println("┌──────────┐");
		
		for(int i = 0;i<(int)percent/10;i++) {
			s +='■';
		}
		
		s +=(int)percent + "%";
		
		if(s.length()<11) {
			while(s.length()<11) {
				s+=" ";
			}
			System.out.println(s + "│");	
		}else {
			System.out.println(s);
		}
		
		
		System.out.println("└──────────┘");
		
		
		sc.close();
	
	}
}

