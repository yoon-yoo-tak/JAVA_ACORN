package java02.Control.Ex01if;

import java.util.Random;

public class Quiz03 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt();
		System.out.println(num%10);
		
		switch(num%10) {
		case 9:
			System.out.println("랜덤수 9");
			break;
		case -3:
			System.out.println("랜덤수 -3");
			break;
		default:
			System.out.println("그 이외의 모든 수");
		}
	}
}
