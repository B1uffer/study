package 객체지향_프로그래밍1;

public class MyMath2 {
	
	long a, b;
	
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수(여기에 들어갈 것)가 필요없다.
	long add() {
		return a + b;		// a, b는 인스턴스 변수임
		
	}
	
	long subtract() {
		return a - b;
		
	}
	
	long multiply() {
		return a * b;
		
	}
	
	double divide() {
		return a / b;
		
	}

	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능함
	static long add(long a, long b) {		// 여기에서의 a, b는 지역변수가 된다
		return a + b;
		
	}
	
	static long subtract(long a, long b) {
		return a - b;
		
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(double a, double b) {
		return a / b;
		
	}
} 
