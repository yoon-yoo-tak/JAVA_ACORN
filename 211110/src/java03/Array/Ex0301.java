package java03.Array;

import java.util.Random;

public class Ex0301 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random rand = new Random();
//		�Է�
		for(int i = 0; i<lotto.length;i++) {
//			���� �ζ� ��ȣ ����
			int randNum = rand.nextInt(45)+1;
//			�ߺ� üũ�� �ϱ� ���� ����
			boolean isDuplicate = false;
//			������ lotto �迭�� ����� ���� ���� ������ ���� ������ ��
			for(int j = 0 ; j<i;j++) {
				if(lotto[j]==randNum) {
					System.out.println(i + " : " +lotto[j]);
					isDuplicate = true;
					i--;
					break;
				}
			}
//			�ζ� �迭�� ���� ��ȣ ����
			if(isDuplicate == false) {
				lotto[i]=randNum;
			}
		}
		System.out.println("================");
		for(int i = 0; i<lotto.length;i++) {
			System.out.println(lotto[i]);	
		}	
		
	}
}
