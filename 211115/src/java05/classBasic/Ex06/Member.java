package java05.classBasic.Ex06;

class Member {
	private String id;
	private String picture;
	
//	다형성은 같은 메소드 이름으로 인자의 모양(자료형) 또는 갯수를 다르게 하여
//	표현하는 방법으로 아래 두 생성자가 다형성을 표현한 방법이다.
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
//	this연산자는 클래스를 의미한다.
//	내부 필드를 호출할 경우 사용되며 생성자를 호출할 경우도 사용된다.
	public Member() {
//		this.id = "";
//		this.picture = "";
		
//		Member("", "");
		this("", "");
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
