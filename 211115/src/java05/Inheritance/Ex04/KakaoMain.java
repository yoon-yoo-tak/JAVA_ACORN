package java05.Inheritance.Ex04;
// Talkbox�� ���������� ���ο� �ִ� Member Ŭ������ �������� �ʾұ� ������ null ���
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
//		talkbox�� member�� ��� �޾� member ���� �޼ҵ带 ����� �� ����
		talkbox.setId("��");
		talkbox.setPicture("����");
		talkbox.setContents("����� ����");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getId());
	}
}
