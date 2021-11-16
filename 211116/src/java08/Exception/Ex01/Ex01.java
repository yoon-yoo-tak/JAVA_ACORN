package java08.Exception.Ex01;

public class Ex01  implements InterTest{
	final int Num = 100;
	int result;
	
//	@Override
//	상속 구현시 메소드의 이름 또는 인자 부분이 잘못된 경우 에러를 발생시킴
//	개발자에게 잘못된 구현임을 알림
	@Override
	public void NoExceptionCase() {
		for(int i=0 ; i<10;i++) {
//			Math.random()*100 <= 지금은 사용안하는 예전 랜덤
			result = Num/(int)(Math.random()*100);
			System.out.println(result);
		}
	}
}
