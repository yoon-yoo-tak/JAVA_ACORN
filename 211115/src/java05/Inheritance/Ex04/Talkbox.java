package java05.Inheritance.Ex04;
//Ŭ������ ��� ���� ��� extends�� �̿��Ѵ�.
//���� �ڵ忡���� Talkbox�� Member�� ��� �޴� ���̴�.
public class Talkbox extends Member{
	private String contents;
	private String chatTime;
	
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
