package java02.Control.Ex01if;

import java.util.Scanner;

public class Quiz01 {
// 1. �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
	public static void main(String[] args) {
//		������ �Է� �� Scanner [�ν��Ͻ���] = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���?");
		int num1 = in.nextInt();
		System.out.println("���� �Է��ϼ���?");
		int num2 = in.nextInt();
		System.out.println("���� �Է��ϼ���?");
		int num3 = in.nextInt();
		
		System.out.println("�Է� ���� �� �� �� ū �� ó�� ��...");
		int max = 0;
		if(num1>num2) max = num1;
		else          max = num2;
		if(max<num3) max = num3;
		System.out.println("�ִ밪 : " + max);
	}

}
