package java02.Control.Ex03Switch;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		System.out.println(num);
		
		switch(num/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("F");
		}
	}

}
