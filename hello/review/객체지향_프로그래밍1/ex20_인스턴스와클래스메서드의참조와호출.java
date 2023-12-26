package 객체지향_프로그래밍1;

public class ex20_인스턴스와클래스메서드의참조와호출 {
	
	int iv = 10;			// 인스턴스 변수
	static int cv = 20;		// 클래스 변수
	
	int iv2 = cv;		// 얘는 사용 가능
// static int cv2 = iv; 인스턴스 변수를 사용할 수 없음 iv
	static int cv2 = new ex20_인스턴스와클래스메서드의참조와호출().iv;		// 객체를 생성해야 사용가능
	
	
	static void staticMethod1() {		// 클래스 메서드
		System.out.println(cv);
		// System.out.println(iv); 클래스 메서드에선 인스턴스 변수를 사용할 수 없음
		
		ex20_인스턴스와클래스메서드의참조와호출 c = new ex20_인스턴스와클래스메서드의참조와호출();		// 인스턴스 메서드의 객체를 생성함
		
		System.out.println(c.iv);		// 인스턴스 메서드의 객체에서 인스턴스 변수를 호출할 수 있음
		
	}
	
	void instanceMethod1() {			// 인스턴스 메서드
		System.out.println(cv);
		System.out.println(iv); 		// 인스턴스 메서드에서는 인스턴스 변수를 바로 사용할 수 있음
		
		
	}
	
	static void staticMethod2() {		// 클래스 메서드 2
		staticMethod1();
		// instanceMethod1();		클래스 메서드에선 인스턴스 메서드를 바로 불러올 수 없고 객체를 생성해야함
		ex20_인스턴스와클래스메서드의참조와호출 c = new ex20_인스턴스와클래스메서드의참조와호출();		// 객체 생성
		c.instanceMethod1();		// 인스턴스 메서드는 인스턴스 객체를 생성한 후에야 호출할 수 있음
		
	}
	
	void instanceMethod2() {		// 인스턴스 메서드 2
		
		staticMethod1();			// 인스턴스 메서드에선 클래스 메서드, 인스턴스 메서드 모두 호출가능
		instanceMethod1();			// 인스턴스 생성 없이 가능하다
	}
	
	// 인스턴스 멤버간의 호출에는 아무런 문제가 없다.
	// 하나의 인스턴스 멤버가 존재한다는 것은 인스턴스가 이미 생성되어있다는 것을 의미하며
	// 다른 인스턴스 멤버들도 모두 존재하기 때문이다.

}
