package java07.AccessController.Ex01;

/*
 * ���� ��Ű�� �������� private��  ������ ��� ������ ���� ����
 */

public class Main {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		
		ex01.default_n = 1;
		ex01.public_n = 2; 
		ex01.protected_n = 3;
		ex01.private_n = 4;
	}

}
