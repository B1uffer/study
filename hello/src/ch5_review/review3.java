package ch5_review;

public class review3 {

	public static void main(String[] args) {
	
		
		System.out.println();
		
		System.out.println("Hello," + helloMan("철수") + "!");	
		
		System.out.println(getHello());
		
		
		System.out.println(sum(3, 5));
		
	}


	static void hello() {
		
		
		return;
	}
	
	static String helloMan(String name) {
		
		return name;
	}
	
	static String getHello() {
		
		return "Hello";
	}
	
	static int sum(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
}



