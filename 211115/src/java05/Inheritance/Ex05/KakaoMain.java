package java05.Inheritance.Ex05;
// �����ڸ� �̿��� �ʱ�ȭ
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox("��", "����", 
				"����� ����", "10:06");
//		talkbox�� member�� ��� �޾� member ���� �޼ҵ带 ����� �� ����
//		talkbox.setId("��");
//		talkbox.setPicture("����");
//		talkbox.setContents("����� ����");
//		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getId());
	}
}
