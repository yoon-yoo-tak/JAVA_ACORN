package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visit = in.nextInt();
		in.close();
		String vis = "ù";
		if(visit>1) {
			vis = "��";
		}
	System.out.println(vis + "�湮 �����մϴ�.");
	}

}

// �� ���� �Է¹޾� ū ���� ����Ͻÿ�.