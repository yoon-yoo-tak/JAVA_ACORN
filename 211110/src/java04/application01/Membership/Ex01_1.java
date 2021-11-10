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
		
		String one = "회원가입";
		String two = "로그인";
		String three = "종료";
		
		if(choice == 1) {
			System.out.println(one + " 선택함");
			register();
		}else if(choice == 2) {
			System.out.println(two + " 선택함");
			login();
		}else if(choice == 3) {
			System.out.println(three + " 선택함");
			end();
		}else {
			System.out.println("잘못된 수를 입력하였습니다.");
		}
		
	}
	private static void end() {
		System.out.println("종료를 선택하셨습니다. 안녕히 가세요.");
		
	}

	private static void login() {
		System.out.println("이름을 입력해주세요.");
		String id = in.next();
		if(id == names[0]) {
			System.out.println("로그인에 성공하였습니다." + names[0] + " 님 , 안녕하세요?");
		}else {
			System.out.println("이름이 다릅니다.");
			login();
		}
		
	}

	private static void register() {
		System.out.println("");
		in = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = in.next();
		names[0] = name;
		System.out.println("나이를 입력하세요");
		age = in.nextInt();
		System.out.println("성별을 입력해주세요");
		gender = in.next();
		System.out.println(name + "님 회원가입을 환영합니다.");
		menu();
	}

	private static void menu() {
		String menuStr = "========================\n";
		menuStr += "1. 회원가입\n";
		menuStr +="2. 로그인\n";
		menuStr +="3. 종료\n";
		menuStr +="========================\n";
		menuStr +="위의 메뉴를 선택하세요?";
		System.out.println(menuStr);
		
		choice = in.nextInt();
		mainMenuExec(choice);
		
	}

}
