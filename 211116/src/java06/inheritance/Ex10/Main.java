package java06.inheritance.Ex10;

public class Main {

	public static void main(String[] args) {
//		Main���� Ŭ������ �����ϰ� �Ǹ� �����Ǿ� ���� ���� �޼ҵ� ������
//		�ڵ� ���ο� �����ؾ� �Ѵ�.
//		abstract class�� ����� ���� ���� �� �ð���..
		Game attack = new Game() ;
		
		System.out.println(attack.StandoffAttack());
		System.out.println(attack.MelleAttack());
	}

}
