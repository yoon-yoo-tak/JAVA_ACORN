package java05.Inheritance.Ex03;
// Talkbox�� ���������� ���ο� �ִ� Member Ŭ������ �������� �ʾұ� ������ null ���
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
//		talkbox�� member ��ü�� �����ϱ� ���� ������ ���� �� setter�� ���� ����
		Member member = new Member();
//		talkbox.setMember(member );
		member.setId("��");
		member.setPicture("����");
		talkbox.setMember(member );
		
		talkbox.setContents("����� ����");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
//		id�� member�� �������� getMember�� ���� member�� �о� ���̰�
//		getid�� ���� id�� ���
		System.out.println(talkbox.getMember().getId());

	}

}
