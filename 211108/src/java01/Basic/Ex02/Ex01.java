package java01.Basic.Ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		Scanner ��� Ŭ������ in�̶�� ������ �����Ͽ� ����ϰڴ�. ���ǹ���
//		java������ Ŭ������ ����ȭ �Ѱ��� �ν��Ͻ�(instance)��� �Ѵ�.
//		Ŭ������ �ν��Ͻ�ȭ ��ų ��� ������ ���� �������� ���ȴ�.
//		[Ŭ������] [�ν��Ͻ���] = new [Ŭ������]
		Scanner in = new Scanner(System.in);
//		String�� ���ڿ��� ó���ϴ� Ŭ�����̴�.
//		���ڿ��� ������ ��� in �ν��Ͻ���  next() ��� �޼ҵ带 �̿�
		
		String name = in.next();
		in.close();
		System.out.println(name);

	}	

}
