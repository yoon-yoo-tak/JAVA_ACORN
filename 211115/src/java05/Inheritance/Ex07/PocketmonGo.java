package java05.Inheritance.Ex07;

import java.util.Random;

/*
 * PocketmonGo
 * �̸�
 * �ɷ�ġ 
 *  - �����
 *  - ������
 *  - Ű
 *  - ���Ǹ�
 *  - ����
 */
public class PocketmonGo extends GameChar{
	public PocketmonGo() {
		super(5);
		String [] ability = {"�����", "������","Ű", "���Ǹ�", "����"};
		int [] data = {35, 4, 28, 18854, 38};
		
		for(int i=0;i<ability.length;i++) {
			setFaculty(ability[i], data[i], i);
		}
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showAbility() {
		String [] facultyName = getFacultyName();
		int [] facultyData = getFacultyData();
		
		System.out.println(name);
		for(int i=0;i<facultyData.length;i++)
			System.out.println(facultyName[i] + " : " + facultyData[i]);
	}
	
	public void BuildUp(int buildRate) {
//		1. ���� �Լ��� ������ �� ������ 0~100���� ���
		Random rand = new Random();
		int probability = rand.nextInt(101);
		
//		2. ���� ���� ���� �Է��� Ȯ������ ��
		if(probability<buildRate) {
//			�������� ������ ��ȭ ���� �޽��� ��� ��
			System.out.println("��ȭ�� �����Ͽ����ϴ�.");
//			����� 3��, ������ 1.5��, Ű 2�� ����
//			�������� ǥ��
			BuildUp();
			showAbility();
		}else {
//			�������� ũ�� ���� �޽��� ���
			System.out.println("��ȭ�� �����Ͽ����ϴ�.");
		}
	}
//	���� Ŭ���� ���ο����� ����ϱ� ������ private���� ����
	private void BuildUp() {
		int []facultyData = getFacultyData();
		facultyData[0] *=3;
		facultyData[1] *=1.5;
		facultyData[2] *=2;
	}
}












