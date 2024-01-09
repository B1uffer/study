package 객체지향_프로그래밍2;

public class testing {

	int a, b;

	testing(int a, int b) {

		this.a = a;
		this.b = b;

	}

	testing() {

	}
	
	int alpha() {
		return a + b;
		
	}
	
	String beta() {
		return "a : " + a + ", b : " + b;
	}
}
