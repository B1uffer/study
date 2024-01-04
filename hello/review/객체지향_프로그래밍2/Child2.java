package 객체지향_프로그래밍2;

public class Child2 extends Parent {
	// parent 참조
	
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);	// Child2.x가 됨
		System.out.println("super.x = " + super.x);		// Parent.x가 됨
	}
}
