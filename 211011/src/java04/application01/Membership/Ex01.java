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
		System.out.println("\n\n이름\t\t아이디\t\t패스워드");
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
		case 2: 
			LoginProc(in);
			break;
		case 3: System.out.println("종료 선택");break;
		default: System.out.println("잘못 입력하셨습니다.");break;
		}
	}
	
	private static void LoginProc(Scanner in) {
//		아이디 입력
		String idd = in.next();
//		패스워드 입력
		String pw = in.next();
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		int i = 0;
		for(i= 0; i<idx;i++) {
			if(id[i].equals(idd)) {
				if(pws[i].equals(pw)) {
					System.out.println("성공");
					return;
				}
//				else {
//					System.out.println("실패");
//				}
//				id가 ids저장되어 있고 패스워드를 비교했으므로
//				id가 고유값이기 때문에 더 이상 비교할 필요가 없다.
//				break;
			}
		}
		
			System.out.println("실패");
		
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
	
	static void addMember() {
		names[idx] = "jhon";
		id[idx] = "jhon";
		pws[idx++] = "1234";
		
		names[idx] = "홍길동";
		id[idx] = "gildong";
		pws[idx++] = "1111";
	}

	
	

}
