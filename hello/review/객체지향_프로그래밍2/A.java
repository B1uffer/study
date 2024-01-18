package 객체지향_프로그래밍2;

public class A {
	
	public void methodA(B b) {
		b.methodB();
		
		// 2. class A를 생성하고 메서드를 하나 만든 다음 매개변수를 미리 만든 B 인스턴스 b를 넣어준다
		// 후에 b 인스턴스를 이용해 메서드를 불러옴
		
	}
	
	public void methodA2(I i) {
		
		i.methodB();
		
		// 이 경우 인스턴스 I를 생성하고 이를 구현하는 클래스를 B로 설정했다
		// 그 후 I 타입의 i 인스턴스를 매개변수로 생성하고 i 인스턴스를 통해 메서드를 불러오게끔 했음
		// 이게 쌉가능
		
		// 클래스 A는 여전히 methodB를 불러오지만, A는 인터페이스 I와 직접적인 관계가 있다. (메서드의 매개변수의 I i)
		
	}
}
