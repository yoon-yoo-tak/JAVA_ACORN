package java02.Control.Ex01if;
import java.util.Scanner;

public class Quiz {

	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	// 1��
//	        int num1,num2,num3;
//	        int result1;
	    	
//	        
	       
//	        System.out.print("���� �Է� : ");
//	        num1 = sc.nextInt();
//	        System.out.print("���� �Է� : ");
//	        num2 = sc.nextInt();
//	        System.out.print("���� �Է� : ");
//	        num3 = sc.nextInt();
//	        
//	        result1 = (num1 > num2)? num1: num2;        
//	        int result2 = num3 > result1? num3: result1;
//	        
//	        System.out.println(result2);
	        
	        // 2��
//	    	System.out.println("�Ǻ��� �� : ");
//	    	int a = sc.nextInt();
//	    	if(a>0) {
//	    		System.out.println("��� : " + a);	
//	    	}else {
//	    		System.out.println("���� : " + Math.abs(a));
//	    	}
	        
	        // 3��
	    	int a = sc.nextInt();
	    	
	    	int age = 21-a+1;
	    	if(age<0) {
	    		age += 100;
	    	}
	    	System.out.println(a + "�⿡ �¾ ����� " + age + " ���Դϴ�.");
	        
	        // 4��
//	        System.out.println("������� �Ÿ��� ������ �����ϼ���? ");
//	        int range = sc.nextInt();
//	        String a = "�ִ� ��ȿ ��Ÿ����� ";
//	        if(range<50) {
//	        	System.out.println(a + (50-range) + "m �������ϴ�.");
//	        }else {
//	        System.out.println(a + (range-50) + "m �ٴϴ�.");
//	        }
	    }

}
	
