package java04.application02.Authentication;

import java.util.Random;
import java.util.Scanner;

public class Ex01Quizz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int n = in.nextInt();
		int authnum = getCertiNum(n);
		System.out.println("�Է°� : " + n);
		System.out.println("������ȣ : " + authnum);
	}

	private static int getCertiNum(int n) {
		int digit = 1;
		
		for(int i = 0 ; i<n;i++) {
			digit *= 10;
		}
		
		Random rand = new Random();
		int certiNum = rand.nextInt(digit);
		
		return certiNum;
	}
}
