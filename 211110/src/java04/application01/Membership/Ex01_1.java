package java04.application01.Membership;

import java.util.Scanner;

public class Ex01_1 {
	static int choice;
	static Scanner in = new Scanner(System.in);
	static String name;
	static int age;
	static String gender;
	static String[] names = new String[10];
	
	
	public static void main(String[] args) {
		menu();
		
	}

	private static void mainMenuExec(int choice) {
		
		String one = "ȸ������";
		String two = "�α���";
		String three = "����";
		
		if(choice == 1) {
			System.out.println(one + " ������");
			register();
		}else if(choice == 2) {
			System.out.println(two + " ������");
			login();
		}else if(choice == 3) {
			System.out.println(three + " ������");
			end();
		}else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
		
	}
	private static void end() {
		System.out.println("���Ḧ �����ϼ̽��ϴ�. �ȳ��� ������.");
		
	}

	private static void login() {
		System.out.println("�̸��� �Է����ּ���.");
		String id = in.next();
		if(id == names[0]) {
			System.out.println("�α��ο� �����Ͽ����ϴ�." + names[0] + " �� , �ȳ��ϼ���?");
		}else {
			System.out.println("�̸��� �ٸ��ϴ�.");
			login();
		}
		
	}

	private static void register() {
		System.out.println("");
		in = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name = in.next();
		names[0] = name;
		System.out.println("���̸� �Է��ϼ���");
		age = in.nextInt();
		System.out.println("������ �Է����ּ���");
		gender = in.next();
		System.out.println(name + "�� ȸ�������� ȯ���մϴ�.");
		menu();
	}

	private static void menu() {
		String menuStr = "========================\n";
		menuStr += "1. ȸ������\n";
		menuStr +="2. �α���\n";
		menuStr +="3. ����\n";
		menuStr +="========================\n";
		menuStr +="���� �޴��� �����ϼ���?";
		System.out.println(menuStr);
		
		choice = in.nextInt();
		mainMenuExec(choice);
		
	}

}
