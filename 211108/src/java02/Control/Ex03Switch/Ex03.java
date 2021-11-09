package java02.Control.Ex03Switch;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int max = rand.nextInt(10)+1;
		int min = rand.nextInt(10)+1;
		
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		System.out.println(min + " " + max);
		int[] arr =new int[10];
		for(int i = 0; i<10;i++) {
			arr[i] = rand.nextInt(10);
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[9]);

	}

}
