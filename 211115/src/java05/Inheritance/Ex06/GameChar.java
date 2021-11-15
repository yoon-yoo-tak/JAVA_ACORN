package java05.Inheritance.Ex06;

public class GameChar {
	int [] facultyData;		//�ɷ� ��ġ ������
	String [] facultyName;	//�ɷ� �̸� ������
	
//	�� ���� �ɷ�ġ�� ������� ����
	public GameChar(int size) {
		facultyData = new int[size];
		facultyName = new String[size];
	}
//	�ɷ�ġ ���
	public int[] getFacultyData() {
		return facultyData;
	}

	public String[] getFacultyName() {
		return facultyName;
	}
//	�ɷ�ġ ����
	public void setFaculty(String name, int data, int idx) {
//		�ɷ�ġ�� ��ġ�� �迭���� ũ�� ������ �߻��� �� �������� ������ ���� ����
		if(this.facultyData.length>idx) {
			this.facultyData[idx] = data;
			this.facultyName[idx] = name;	
		}	
	}
	
}
