package 객체지향_프로그래밍1;

public class ex6_메서드연습 {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		// long add(long a, long b) {
		// return a + b
		// }
		long result2 = mm.subtract(5L, 3L);
		// long subtract(long a, long b) {
		// return a - b
		// }	
		long result3 = mm.multiply(5L, 3L);
		// long multiply(long a, long b) {
		// return a * b
		// }
		double result4 = mm.divide(5L, 3L);
		// double divide(double a, double b) {
		// return a / b
		// }
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}

}
