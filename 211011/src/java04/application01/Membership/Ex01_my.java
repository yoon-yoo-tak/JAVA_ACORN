package java04.application01.Membership;

import java.util.Scanner;

public class Ex01_my {
	static String[] names, id, pws;
	static int idx, choice;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		init(10);
		addMember();
//		Scanner in = new Scanner(System.in);
		menu();
		System.out.println("�̸�\t���̵�\t�н�����");
		for(int i = 0 ; i <idx; i++) {
			System.out.println(names[i]+"\t"+id[i]+"\t"+pws[i]);
		}
		Login();
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
		choice = in.nextInt();
		mainMenuExec(choice);
	}
	
	private static void mainMenuExec(int choice) {
		
		switch(choice) {
		case 1:
			Membership(in);
			break;
		case 2:
			Login();
			break;
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
	
	private static void Login() {
		System.out.println("���̵� �Է��ϼ���");
		String idd = in.next();
		String pass = in.next();
		for(int i = 0; i<idx;i++) {
			if(id[i].equals(idd)) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				if(pws[i].equals(pass)) {
					System.out.println("�α��� ����!");
				}
			}else {
				System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ���� �ּ���.");
			}
			break;
		}
	}
	static void addMember() {
		names[idx] = "������";
		id[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "ȫ�浿";
		id[idx] = "gildong";
		pws[idx++] = "1111";
	}

	
	

}
