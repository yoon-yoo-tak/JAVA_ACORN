package java04.application02.Authentication;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int n = in.nextInt();
		int authnum = getCertiNum(n);
		System.out.println("�Է°� : " + n);
		System.out.println("������ȣ : " + authnum);
	}

	private static int getCertiNum(int i) {
		int certiNum = i*10;
		//�޼ҵ尡 ������ �� ������ �� ����
		return certiNum;
	}

}
