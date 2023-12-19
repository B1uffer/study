package 객체지향_프로그래밍1;

public class ex9_기본형및참조형매개변수 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);		// 여기서 static인 change를 불러옴
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(int x) {		// 기본형 매개변수 int x
		x = 1000;		// 이 x는 이 메서드에서만 사용됨
		System.out.println("change() : x = " + x);
	}
}
