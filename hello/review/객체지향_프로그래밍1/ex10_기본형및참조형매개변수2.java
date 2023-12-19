package 객체지향_프로그래밍1;

public class ex10_기본형및참조형매개변수2 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		

	}
	
	static void change(Data d) {		// 참조형 매개변수 Data d
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
		
	}
}
