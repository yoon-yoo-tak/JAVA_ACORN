package java02.Control.Ex03Switch;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totaltime = 230; // ���Ǳ���
		int N;
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
		String top = "������������������������\n";
		String mid  = "��";
		String bottom = "\n������������������������";
		
		
		
		for(int i = 0;i<(int)percent/10;i++) {
			mid +='��';
		}
		
		mid +=(int)percent + "%";
		
		if(mid.length()<11) {
			while(mid.length()<11) {
				mid+=" ";
			}
			System.out.println(top + mid + "��" + bottom);	
		}else {
			System.out.println(top + mid + bottom);
		}
					
		sc.close();
	
	}
}

