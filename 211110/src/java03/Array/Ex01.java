package java03.Array;

public class Ex01 {
/*
 * �迭�� �⺻ ����
 * �ڷ��� [] �迭�� = new �ڷ���[size];
 * �ڷ��� �迭�� [] = new �ڷ���[size]; 
 *
 * �迭�� ��ġ����(index)�� 0���� ����
 * 
 */
	
	
	public static void main(String[] args) {
//		������ �迭�� 10���� ������ ����
		int [] nums = new int[10];

//		�迭�� ���̸� ǥ���� ��� �迭��.length �� �̿��Ѵ�.
		for(int i=1;i<nums.length;i++) {
			nums[i] = i*i;
			System.out.println(i + " * " + i + " = " + nums[i]);
		}
		
		
	}

}
