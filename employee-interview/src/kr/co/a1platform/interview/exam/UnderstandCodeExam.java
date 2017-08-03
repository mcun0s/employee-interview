package kr.co.a1platform.interview.exam;

/**
 * Call by Reference를 이해하고, Code를 잘 이해할 수 있는지를 검증한다.
 * @author Unho Yeo
 * */
public class UnderstandCodeExam {
	
	public static void swap(CustomObj param) {
		int temp = param.a;
		param.a = param.b;
		param.b = temp;
	}

	public static void run() {
		CustomObj instance = new CustomObj();
		instance.a = 10;
		instance.b = 20;
        
		// 1. First Logging
		System.out.println("a=" + instance.a + ", b=" + instance.b);
        swap(instance);
        
        // 2. Second Logging
        System.out.println("a=" + instance.a + ", b=" + instance.b);
	}
	
	public static void main(String[] args) {
		
		for (int i=0; i < 5; i++) {
			for (int j=5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class CustomObj {
	public int a;
	public int b;
}