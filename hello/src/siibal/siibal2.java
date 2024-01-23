package siibal;

public class siibal2 {

	public static void main(String[] args) { // main도 하나의 메서드다
		
		siibal2 hello = new siibal2();
		
		hello.hello();
		
		
		//hello();		// static이 붙으면 인스턴스를 생성하지 않아도 불러올 수 있음

		helloMan("철수");
		
		System.out.println(getHello());
		
		System.out.println(sum(3,2));
		
		int num1 = 3; int num2 = 5;
		
		System.out.println(sum(num1, num2));
	}

	
	// << 메소드 구현 연습>>
	
	// 1. 메소드명 : hello, 매개변수 없음, 반환값 없음, hello! 출력하기
	
	 void hello() {
		
		System.out.println("Hello!");
		
	}
	
	// 2. 메소드명 : helloMan, 매개변수 name(String), 반환값 없음, Hello, (name)!' 출력하기
	
	static void helloMan(String name) {
		
		System.out.println("Hello," + name + "!");
		
	}
	
	// 3. 메소드명 getHello, 매개변수 없음, 반환값 "Hello", "Hello" 문자열을 반환하는 메소드를 만들어주세요.
	
	static String getHello() {
		
		return "Hello";
	
	}
	
	// 4. 메소드명 sum, 매개변수 num1, num2 (int), 반환값은 두개의 합, 두개의 합을 반환하는 메소드를 만들어주세요.
	
	static int sum(int num1, int num2) {
		
		return num1 + num2;
	}
}
