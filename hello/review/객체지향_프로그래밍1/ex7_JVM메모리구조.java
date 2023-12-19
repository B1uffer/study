package 객체지향_프로그래밍1;

public class ex7_JVM메모리구조 {

	public static void main(String[] args) {
		// main에서 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출함
		// 객체를 생성하지 않고도 메서드를 호출할 수 있으려면, 메서드 앞에 'static'을 붙여야함.
		firstMethod();

	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
