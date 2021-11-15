package java05.Inheritance.Ex06;
/*
 * �ɸ��� �̸�
 * ����
 * �ɷ�ġ
 *   - ����
 *   - ���ݷ�
 *   - ����
 *   - ������
 */
public class L2Char extends GameChar{
	public L2Char() {
//		GameChar(4), �θ� Ŭ������ ������ ȣ��
		super(4);
		String [] ability = {"����", "���ݷ�", "����", "������"};
		
		for(int i=0;i<ability.length;i++) {
			setFaculty(ability[i], 1, i);
		}
	}
	private String name;
	private String race;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public void showAbility() {
		System.out.println(name);
		System.out.println(race);
		
		int [] facultyData = getFacultyData();
		String [] facultyName = getFacultyName();
		
		for(int i=0;i<facultyData.length;i++) {
			System.out.println(facultyName[i]+" : "+ facultyData[i]);
		}
	}
}
