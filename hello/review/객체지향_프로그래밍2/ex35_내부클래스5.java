package 객체지향_프로그래밍2;

public class ex35_내부클래스5 {

	public static void main(String[] args) {
		
		// 내부 클래스의 제어자와 접근성에 대해 4
		
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.method1();
		
	}

}
