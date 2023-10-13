package ch5;

public class test1 {

	public static void main(String[] args) {

		hello();

		String name = "철수";

		helloMan(name);

		System.out.println(getHello());
		
		int num1 = 2, num2 = 3;
		
		System.out.println(sum(num1, num2));
		
	}

	static void hello() {

		System.out.println("Hello!");

	}

	static void helloMan(String name) {

		System.out.println("Hello, " + name + "!");

	}
	
	static String getHello() {
		
		
		return "Hello";
	}
	
	static int sum(int num1, int num2) {
		
			
		return num1 + num2;
	}

}
