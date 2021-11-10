package java04.application01.Membership;

public class Ex02 {

	static String[] names;
	static int idx;
	
	public static void main(String[] args) {
		names = new String[10];
		idx = 0;
		names[idx++] = "john";
		names[idx++] = "gildong";
		
		method1();
	}
	
	private static void method1() {
		for(int i = 0 ; i< idx;i++) {
			System.out.println(names[i]);
		}
	}

}
