package 객체지향_프로그래밍2;

public class A3 {
	
	public void methodA() {
		
		// 제3의 클래스의 메서드를 통해 인터페이스 I3를 구현한 클래스의 인스턴스를 얻어옴
		// 인스턴스를 직접 생성하지 않고 getInstance()라는 메서드를 통해 제공받는 것
		
		// 이렇게 하면 뭐가 좋음?????????
		// 나중에 다른 클래스의 인스턴스로 변경되어도 A클래스의 변경없이 getInstance()만 변경하면 된다.
		// B3 참조
		
		I3 i = InstanceManager.getInstance();
		
		i.methodB3();
		
		System.out.println(i.toString());
		// 인터페이스 I3 타입의 참조변수 i로도 Object 클래스의 메서드들을 사용할 수 있다.
		// i에 toString은 없지만 Object클래스의 메서드를 사용할 수 있음
		
		
		

	}
}
