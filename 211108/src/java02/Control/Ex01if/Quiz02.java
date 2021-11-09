package java02.Control.Ex01if;

import java.util.Scanner;

public class Quiz02 {

//  2. 숫자를 판별하여 양수인지 음수인지 판별하라.	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("판별할 수 : ");
		int num = in.nextInt();
		String msg = "";
		if(num>0) {
			System.out.println("양수 : "+ num);
		}else {
			System.out.println("음수 : " + (-num));
		}
	}

}
