package java04.application01.Membership;

import java.util.Scanner;

public class Ex01 {
// �޼ҵ� �����
// 1. ���� ���Ǵ� �͵��� ��� �޼ҵ� �̸����� ȣ���Ͽ� ���
// 2. �Է°� ���޽� ��ȣ ���θ� ����Ѵ�. ������ [�ڷ���] ������ �̴�.
	
	static String [] names;
	public static void main(String[] args) {
		names = new String[10];
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}

	private static void mainMenuExec(int choice) {
		String one = "ȸ������";
		String two = "�α���";
		String three = "����";
		
		switch(choice) {
		case 1: System.out.println("ȸ������ ����");break;
		case 2: System.out.println("�α��� ����");break;
		case 3: System.out.println("���� ����");break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
		}
	}

	private static void menu() {
		String menuStr = "========================\n";
		menuStr += "1. ȸ������\n";
		menuStr += "2. �α���\n";
		menuStr += "3. ����\n";
		menuStr += "========================\n";
		menuStr += "���� �޴��� �����ϼ���?";
		System.out.println(menuStr);
		
	}

}
