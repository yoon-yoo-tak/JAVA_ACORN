package java01.Basic.Ex03;

import java.util.Scanner;

public class Ex03Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		System.out.println("����� �̸��� �Է��ϼ���?");
//		String name = in.next();
//		System.out.println(name + "���� ���̸� �Է��� �ּ���?");
//		int age = in.nextInt();
//		in.close();
//		System.out.println(name + " ���� " + age + " �� �̱���");
//		
		
		System.out.println("Ű�� �Է��ϼ��� : ");
		double h = in.nextDouble();
		System.out.println("ǥ�� ü�� ���");
		System.out.println("===========");
		System.out.println("����:" +  h*h*22);
		System.out.println("����:" +  h*h*21);
		System.out.println("===========");
		
		System.out.println("����� �����Ը� �Է��ϼ���? ");
		double weight = in.nextDouble();
		in.close();

		
		System.out.println();
		System.out.println("�񸸵� ���");
		System.out.println("=========");
		System.out.println("���� : " + ((weight - h*h*22)/(h*h*22))*100);
		System.out.println("���� : " + ((weight - h*h*21)/(h*h*21))*100);
		System.out.println("=========");
	}

}
