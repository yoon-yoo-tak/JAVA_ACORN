package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		final int MAXSEC = 230;
		
//		�ʸ� �Է¹ޱ�(���� �ð����� ū �ð��̸� ���Է� �䱸)		
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

		
		int percent = sec*100/MAXSEC;
		String progress = "";
		int blockCnt = percent/10;
		for(int i=0; i<blockCnt;i++) 
			progress += "��";
		
//		%02d > 2�ڸ� ������ Ȯ���ϰ� ��ȿ���ڰ� �ƴ� �κ��� 0���� ���
		progress += String.format("%02d", percent)+"%";
		
		System.out.println("������������������������");
		System.out.print("��");
		System.out.print(progress);
		for(int i=3+blockCnt;i<10;i++) {
			System.out.print("   ");
		}
		if(blockCnt<8) {
			System.out.println("��");
		}
		System.out.println("\n������������������������");
		
	}

}
