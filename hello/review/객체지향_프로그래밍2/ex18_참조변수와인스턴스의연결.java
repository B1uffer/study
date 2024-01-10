package 객체지향_프로그래밍2;

public class ex18_참조변수와인스턴스의연결 {

	public static void main(String[] args) {
		
		Parent2 p = new Child3();	//Parent2 타입으로 Child3 인스턴스 참조
		Child3 c = new Child3();	// Child3 타입으로 Child3 인스턴스 참조
		
		System.out.println("p.x = " + p.x);
		p.method();
		// p.method의 경우 메서드를 호출하고 있으므로 참조하는 인스턴스인 child3에 정의된 메서드가 호출된다
		
		System.out.println("c.x = " + c.x);
		c.method();
		
		

	}

}
