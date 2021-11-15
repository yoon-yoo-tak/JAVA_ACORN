package java04.application01.Membership;

import java.util.Scanner;

public class Ex02 {
	static String[] names, id, pws;
	static int idx;
	
	public static void main(String[] args) {
		init(10);
		
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		
		mainMenuExec(in, choice);
		
	}
	
	private static void init(int size) {
		names = new String[size];
		id = new String[size];
		pws = new String[size];
		
		idx = 0;
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
	
	private static void mainMenuExec(Scanner in,int choice) {
		
		switch(choice) {
		case 1:
			Membership(in);
			break;
		case 2: System.out.println("�α��� ����");break;
		case 3: System.out.println("���� ����");break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
		}
	}

	private static void Membership(Scanner in) {
//		Scanner in = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		names[idx] = in.next();
		System.out.println("���̵� �Է��ϼ���");
		id[idx] = in.next();
		System.out.println("�н����带 �Է��ϼ���");
		pws[idx] = in.next();		
		
		idx++;
		System.out.println("ȸ�������� ���ϵ帳�ϴ�.");
	}
	
	
	

}
