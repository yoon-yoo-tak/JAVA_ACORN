package java06.inheritance.Ex09;

public class Main {

	public static void main(String[] args) {
//		Main���� Ŭ������ �����ϰ� �Ǹ� �����Ǿ� ���� ���� �޼ҵ� ������
//		�ڵ� ���ο� �����ؾ� �Ѵ�.
//		abstract class�� ����� ���� ���� �� �ð���..
		Attack attack = new Attack() {
			@Override
			public String MelleAttack() {
				return "�y�y�y";
			}
		};
		
		System.out.println(attack.StandoffAttack());
		System.out.println(attack.MelleAttack());
	}

}
