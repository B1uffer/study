package 객체지향_프로그래밍1;

public class ex11_기본형매개변수와참조형매개변수3 {

	public static void main(String[] args) {
		
		int[] x = {10};		// 크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
		

	}
	
	static void change(int[] x) {		// int x가 아닌 int[] x이므로 참조형 매개변수
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
	
}
