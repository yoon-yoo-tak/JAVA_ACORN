package java02.Control.Ex01if;
import java.util.Scanner;

public class Quiz {

	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	// 1번
//	        int num1,num2,num3;
//	        int result1;
	    	
//	        
	       
//	        System.out.print("숫자 입력 : ");
//	        num1 = sc.nextInt();
//	        System.out.print("숫자 입력 : ");
//	        num2 = sc.nextInt();
//	        System.out.print("숫자 입력 : ");
//	        num3 = sc.nextInt();
//	        
//	        result1 = (num1 > num2)? num1: num2;        
//	        int result2 = num3 > result1? num3: result1;
//	        
//	        System.out.println(result2);
	        
	        // 2번
//	    	System.out.println("판별할 수 : ");
//	    	int a = sc.nextInt();
//	    	if(a>0) {
//	    		System.out.println("양수 : " + a);	
//	    	}else {
//	    		System.out.println("음수 : " + Math.abs(a));
//	    	}
	        
	        // 3번
	    	int a = sc.nextInt();
	    	
	    	int age = 21-a+1;
	    	if(age<0) {
	    		age += 100;
	    	}
	    	System.out.println(a + "년에 태어난 당신은 " + age + " 살입니다.");
	        
	        // 4번
//	        System.out.println("사용자의 거리를 변수에 저장하세요? ");
//	        int range = sc.nextInt();
//	        String a = "최대 유효 사거리보다 ";
//	        if(range<50) {
//	        	System.out.println(a + (50-range) + "m 가깝습니다.");
//	        }else {
//	        System.out.println(a + (range-50) + "m 멉니다.");
//	        }
	    }

}
	
