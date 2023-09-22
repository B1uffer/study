package hello;

public class hello {

		int age = 30;
		
	public static void main(String[] args) {

		System.out.println("Hello, World!");

		hello2 h2 = new hello2();
		h2.test();
		System.out.println(h2.age);
		h2.test2();
		
		

	}

}

class hello2 {
	
	public int age = 25;

	public void test() {

		System.out.println("Hello, World2!");

	}
	
	public String test2() {
		
		return "Hello, Test!";


	}
	
}

