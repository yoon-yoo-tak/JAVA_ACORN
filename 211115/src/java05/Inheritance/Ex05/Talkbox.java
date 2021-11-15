package java05.Inheritance.Ex05;
//Ŭ������ ��� ���� ��� extends�� �̿��Ѵ�.
//���� �ڵ忡���� Talkbox�� Member�� ��� �޴� ���̴�.
public class Talkbox extends Member{
	private String contents;
	private String chatTime;
	
	public Talkbox(String id, String picture, 
			String contents, String chatTime) {
//		this�� ���� Ŭ������ �ǹ��ϸ� setId�� �θ� Ŭ������ �ִ� ���� ��������
//		�Ʒ��� ���� �ڵ�� ������ ����.
//		this.setId(id);
//		this.setPicture(picture);

//		�θ� Ŭ������ �޼ҵ带 �̿��� ��� super�� �̿��Ͽ� �޼ҵ� Ȱ��		
//		super.setId(id);
//		super.setPicture(picture);
		
//		�ʱ�ȭ ���� �������� ���� �����ڸ� �̿��Ѵ�.
//		Member(id, picture);
		super(id, picture);
		
//		id�� private�̹Ƿ� ���� ���� �Ұ�
//		super.id = id;
		
		this.contents = contents;
		this.chatTime = chatTime;
	}
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
	
}

