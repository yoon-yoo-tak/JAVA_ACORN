package java05.classBasic.Ex05;

class Member {
	private String id;
	private String picture;
	
//	�������� ���� �޼ҵ� �̸����� ������ ���(�ڷ���) �Ǵ� ������ �ٸ��� �Ͽ�
//	ǥ���ϴ� ������� �Ʒ� �� �����ڰ� �������� ǥ���� ����̴�.
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	public Member() {
	
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
