package java02.Control.Ex01if;

import java.util.Scanner;

public class Quiz02 {

//  2. ���ڸ� �Ǻ��Ͽ� ������� �������� �Ǻ��϶�.	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�Ǻ��� �� : ");
		int num = in.nextInt();
		String msg = "";
		if(num>0) {
			System.out.println("��� : "+ num);
		}else {
			System.out.println("���� : " + (-num));
		}
	}

}
