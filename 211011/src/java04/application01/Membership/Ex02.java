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
		menuStr += "1. 회원가입\n";
		menuStr += "2. 로그인\n";
		menuStr += "3. 종료\n";
		menuStr += "========================\n";
		menuStr += "위의 메뉴를 선택하세요?";
		System.out.println(menuStr);
		
	}
	
	private static void mainMenuExec(Scanner in,int choice) {
		
		switch(choice) {
		case 1:
			Membership(in);
			break;
		case 2: System.out.println("로그인 선택");break;
		case 3: System.out.println("종료 선택");break;
		default: System.out.println("잘못 입력하셨습니다.");break;
		}
	}

	private static void Membership(Scanner in) {
//		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		names[idx] = in.next();
		System.out.println("아이디를 입력하세요");
		id[idx] = in.next();
		System.out.println("패스워드를 입력하세요");
		pws[idx] = in.next();		
		
		idx++;
		System.out.println("회원가입을 축하드립니다.");
	}
	
	
	

}
