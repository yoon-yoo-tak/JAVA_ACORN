package java06.inheritance.Ex08;

import java06.inheritance.Ex09.Game;

public class Main {

	public static void main(String[] args) {
//		Main���� Ŭ������ �����ϰ� �Ǹ� �����Ǿ� ���� ���� �޼ҵ� ������
//		�ڵ� ���ο� �����ؾ� �Ѵ�.
//		abstract class�� ����� ���� ���� �� �ð���..
		Game attack = new Game();
		
		System.out.println(attack.StandoffAttack());
		System.out.println(attack.MelleAttack());
	}

}
