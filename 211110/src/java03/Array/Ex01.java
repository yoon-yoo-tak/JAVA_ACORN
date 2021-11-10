package java03.Array;

public class Ex01 {
/*
 * 배열의 기본 문법
 * 자료형 [] 배열명 = new 자료형[size];
 * 자료형 배열명 [] = new 자료형[size]; 
 *
 * 배열의 위치정보(index)는 0부터 시작
 * 
 */
	
	
	public static void main(String[] args) {
//		정수형 배열로 10개의 공간을 생성
		int [] nums = new int[10];

//		배열의 길이를 표현할 경우 배열명.length 를 이용한다.
		for(int i=1;i<nums.length;i++) {
			nums[i] = i*i;
			System.out.println(i + " * " + i + " = " + nums[i]);
		}
		
		
	}

}
