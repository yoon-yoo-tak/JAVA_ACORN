package java05.Inheritance.Ex01;

public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		talkbox.setId("��");
		talkbox.setPicture("����");
		talkbox.setContents("����� ����");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());

	}

}
