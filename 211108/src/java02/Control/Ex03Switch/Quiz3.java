package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totaltime = 230; // 음악길이
		int N;
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
		String top = "┌──────────┐\n";
		String mid  = "│";
		String bottom = "\n└──────────┘";
		
		
		
		for(int i = 0;i<(int)percent/10;i++) {
			mid +='■';
		}
		
		mid +=(int)percent + "%";
		
		if(mid.length()<11) {
			while(mid.length()<11) {
				mid+=" ";
			}
			System.out.println(top + mid + "│" + bottom);	
		}else {
			System.out.println(top + mid + bottom);
		}
					
		sc.close();
	
	}
}

