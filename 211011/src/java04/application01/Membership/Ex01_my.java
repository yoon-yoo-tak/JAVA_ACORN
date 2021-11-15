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
		System.out.println("이름\t아이디\t패스워드");
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
		menuStr += "1. 회원가입\n";
		menuStr += "2. 로그인\n";
		menuStr += "3. 종료\n";
		menuStr += "========================\n";
		menuStr += "위의 메뉴를 선택하세요?";
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
	
	private static void Login() {
		System.out.println("아이디를 입력하세요");
		String idd = in.next();
		String pass = in.next();
		for(int i = 0; i<idx;i++) {
			if(id[i].equals(idd)) {
				System.out.println("비밀번호를 입력하세요");
				if(pws[i].equals(pass)) {
					System.out.println("로그인 성공!");
				}
			}else {
				System.out.println("아이디와 비밀번호를 다시 확인해 주세요.");
			}
			break;
		}
	}
	static void addMember() {
		names[idx] = "조윤기";
		id[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "홍길동";
		id[idx] = "gildong";
		pws[idx++] = "1111";
	}

	
	

}
