package 객체지향_프로그래밍2;

public class Child extends Parent {
	
		// Parent 참조
		
	void method() {
		
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
		// super 변수는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용하는 참조변수임
		// static에서는 사용할 수 없고 인스턴스 메서드에서만 사용 가능
		
	}
}
