package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totaltime = 230; // ���Ǳ���
		int N;
//		System.out.println("�ʸ� �Է��ϼ���?");
//		int N = sc.nextInt();
		for(;;) {
			System.out.println("�÷��̵� �ʸ� �Է��ϼ���?");
			
			N = sc.nextInt();
			if(N<=totaltime) {
				break;
			}
			System.out.println("�뷡���� �� �ð��� �Է��߽��ϴ�.");
			System.out.print("�ٽ� ");
		}
		
		double percent = (double)N/(double)totaltime*100; // �ۼ�Ʈ��
		
		String s  = "��";
		
		System.out.println("������������������������");
		
		for(int i = 0;i<(int)percent/10;i++) {
			s +='��';
		}
		
		s +=(int)percent + "%";
		
		if(s.length()<11) {
			while(s.length()<11) {
				s+=" ";
			}
			System.out.println(s + "��");	
		}else {
			System.out.println(s);
		}
		
		
		System.out.println("������������������������");
		
		
		sc.close();
	
	}
}

