package java01.Basic.Ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		Scanner 라는 클래스는 in이라는 변수로 지정하여 사용하겠다. 는의미임
//		java에서는 클래스를 변수화 한것을 인스턴스(instance)라고 한다.
//		클래스를 인스턴스화 시킬 경우 다음과 같은 문법으로 사용된다.
//		[클래스명] [인스턴스명] = new [클래스명]
		Scanner in = new Scanner(System.in);
//		String은 문자열을 처리하는 클래스이다.
//		문자열을 저장할 경우 in 인스턴스의  next() 라는 메소드를 이용
		
		String name = in.next();
		in.close();
		System.out.println(name);

	}	

}
