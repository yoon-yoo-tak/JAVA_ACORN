package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		final int MAXSEC = 230;
//		2. �ʸ� �Է¹ޱ�(���� �ð����� ū �ð��̸� ���Է� �䱸)		
		Scanner in = new Scanner(System.in);

		int sec = 0;
		
		for(;;) {
			System.out.println("�÷��̵� �ʸ� �Է��ϼ���?");
			
			sec = in.nextInt();
			if(sec<MAXSEC) {
				break;
			}
			System.out.println("�뷡���� �� �ð��� �Է��߽��ϴ�.");
			System.out.print("�ٽ� ");
		}
		
		System.out.println((sec*100/MAXSEC)+"%");
	}

}
