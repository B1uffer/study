package 객체지향_프로그래밍2;

public class ex20_참조변수와인스턴스의연결3 {

	public static void main(String[] args) {
		
		Parent2 p = new Child5();
		Child5 c = new Child5();
		
		System.out.println("p.x = " + p.x);	// Parent2의 x
		p.method();  //parent2의 메서드 
		System.out.println();
		System.out.println("c.x = " + c.x);  // child5의 x
		c.Method();  // Child5의 메서드
		
		// 인스턴스 변수에 직접 접근하면, 참조변수의 타입에 따라 사용되는 인스턴스 변수가 달라질 수 있다
		
	}

}
