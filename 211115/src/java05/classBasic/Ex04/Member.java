package java05.classBasic.Ex04;

class Member {
	private String id;
	private String picture;
	
//	id�� picture�� �Է¹޾� �ʱ�ȭ �ϴ� ������
//	�����ڴ� �Ʒ��� ���� ��ȯ �ڷ����� ����.
//	Ŭ������ ���� �̸��� ����Ѵ�.
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
