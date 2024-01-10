package 객체지향_프로그래밍2;

public class Child5 extends Parent2 {

	int x = 200;
	
	void Method() {
		System.out.println("x = " + x);	// = this.x
		System.out.println("this.x = " + this.x);		// Child5의 x
		System.out.println("super.x = " + super.x);		// parent2의 x
		
	}
}
