package java08.Exception.Ex02;

public class Ex02 implements InterTest{
	final int Num = 100;
	int result;
	
	@Override
	public void NoExceptionCase() {
		for(int i=0 ; i<10;i++) {
			try {		
//				���ܰ� �߻��� ������ �����Ǵ� ���� ����
				result = Num/(int)(Math.random()*100);
			}catch(ArithmeticException e) {
//				���ܰ� �߻����� ��� ó���� ���� ����
				e.printStackTrace();
				result = 0;
			}
			System.out.println(result);
		}
	}
}
