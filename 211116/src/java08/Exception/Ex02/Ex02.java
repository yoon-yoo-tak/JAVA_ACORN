package java08.Exception.Ex02;

public class Ex02 implements InterTest{
	final int Num = 100;
	int result;
	
	@Override
	public void NoExceptionCase() {
		for(int i=0 ; i<10;i++) {
			try {		
//				예외가 발생할 것으로 예측되는 구문 구현
				result = Num/(int)(Math.random()*100);
			}catch(ArithmeticException e) {
//				예외가 발생했을 경우 처리할 구문 구현
				e.printStackTrace();
				result = 0;
			}
			System.out.println(result);
		}
	}
}
