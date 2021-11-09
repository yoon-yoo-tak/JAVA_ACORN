package java01.Basic.Ex03;

import java.util.Scanner;

public class Ex03Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		System.out.println("당신의 이름을 입력하세요?");
//		String name = in.next();
//		System.out.println(name + "님의 나이를 입력해 주세요?");
//		int age = in.nextInt();
//		in.close();
//		System.out.println(name + " 님은 " + age + " 살 이군요");
//		
		
		System.out.println("키를 입력하세요 : ");
		double h = in.nextDouble();
		System.out.println("표준 체중 계산");
		System.out.println("===========");
		System.out.println("남자:" +  h*h*22);
		System.out.println("여자:" +  h*h*21);
		System.out.println("===========");
		
		System.out.println("당신의 몸무게를 입력하세요? ");
		double weight = in.nextDouble();
		in.close();

		
		System.out.println();
		System.out.println("비만도 계산");
		System.out.println("=========");
		System.out.println("남자 : " + ((weight - h*h*22)/(h*h*22))*100);
		System.out.println("여자 : " + ((weight - h*h*21)/(h*h*21))*100);
		System.out.println("=========");
	}

}
