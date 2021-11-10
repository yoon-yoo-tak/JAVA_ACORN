package java04.application01.Membership;

import java.util.Scanner;

public class Ex01 {
// 메소드 만들기
// 1. 자주 사용되는 것들을 묶어서 메소드 이름으로 호출하여 사용
// 2. 입력값 전달시 괄호 내부를 사용한다. 사용법은 [자료형] 변수명 이다.
	
	static String [] names;
	public static void main(String[] args) {
		names = new String[10];
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}

	private static void mainMenuExec(int choice) {
		String one = "회원가입";
		String two = "로그인";
		String three = "종료";
		
		switch(choice) {
		case 1: System.out.println("회원가입 선택");break;
		case 2: System.out.println("로그인 선택");break;
		case 3: System.out.println("종료 선택");break;
		default: System.out.println("잘못 입력하셨습니다.");break;
		}
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

}
