package java08.Exception.Ex01;

public class Ex01  implements InterTest{
	final int Num = 100;
	int result;
	
//	@Override
//	��� ������ �޼ҵ��� �̸� �Ǵ� ���� �κ��� �߸��� ��� ������ �߻���Ŵ
//	�����ڿ��� �߸��� �������� �˸�
	@Override
	public void NoExceptionCase() {
		for(int i=0 ; i<10;i++) {
//			Math.random()*100 <= ������ �����ϴ� ���� ����
			result = Num/(int)(Math.random()*100);
			System.out.println(result);
		}
	}
}
