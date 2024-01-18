package 객체지향_프로그래밍2;

public class Child6 extends Parent6 implements MyInterface, MyInterface2 {
		
	// MyInterface와 MyInterface2에 중복된 method1()을 오버라이딩
	public void method1() {
		System.out.println("this is method1() in Child6! :)");
		
	}
	
	
}
