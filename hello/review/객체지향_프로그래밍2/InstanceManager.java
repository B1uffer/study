package 객체지향_프로그래밍2;

public class InstanceManager {
	
		// I 타입의 getInstance() 메서드임
	public static I3 getInstance() {
		
		// B 인스턴스를 반환함
		return new B3();
		
		// 내가 다른 인스턴스로 바꾸고 싶으면 return값만 바꿔주면 된다.
		// 가령 return new A3(); 이렇게
		
		
	}
}
