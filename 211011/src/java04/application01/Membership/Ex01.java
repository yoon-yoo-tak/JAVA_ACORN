package java04.application01.Membership;

import java.util.Scanner;

public class Ex01 {
	static String[] names, id, pws;
	static int idx;
	
	public static void main(String[] args) {
		init(10);
		addMember();
		Scanner in = new Scanner(System.in);
		
		
		menu();

		int choice = in.nextInt();
		mainMenuExec(in, choice);
		outputMembers();

	}
	
	private static void outputMembers() {
		System.out.println("\n\n�̸�\t\t���̵�\t\t�н�����");
		for(int i = 0; i<idx;i++) {
			System.out.println(names[i]+"\t\t"+id[i]+"\t\t"+pws[i]);
		}		
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
		case 2: 
			LoginProc(in);
			break;
		case 3: System.out.println("���� ����");break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
		}
	}
	
	private static void LoginProc(Scanner in) {
//		���̵� �Է�
		String idd = in.next();
//		�н����� �Է�
		String pw = in.next();
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		int i = 0;
		for(i= 0; i<idx;i++) {
			if(id[i].equals(idd)) {
				if(pws[i].equals(pw)) {
					System.out.println("����");
					return;
				}
//				else {
//					System.out.println("����");
//				}
//				id�� ids����Ǿ� �ְ� �н����带 �������Ƿ�
//				id�� �������̱� ������ �� �̻� ���� �ʿ䰡 ����.
//				break;
			}
		}
		
			System.out.println("����");
		
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
	
	static void addMember() {
		names[idx] = "jhon";
		id[idx] = "jhon";
		pws[idx++] = "1234";
		
		names[idx] = "ȫ�浿";
		id[idx] = "gildong";
		pws[idx++] = "1111";
	}

	
	

}
