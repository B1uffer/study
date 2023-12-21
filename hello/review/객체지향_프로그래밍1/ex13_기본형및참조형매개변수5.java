package 객체지향_프로그래밍1;

public class ex13_기본형및참조형매개변수5 {

	public static void main(String[] args) {
		
		ex13_기본형및참조형매개변수5 r = new ex13_기본형및참조형매개변수5();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};		// 배열을 생성하고 result2[0]의 값을 0으로 초기화함
		r.add(3, 5, result2);
		System.out.println(result2[0]);

	}

	int add(int a, int b) {
		return a+b;
		
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
}
