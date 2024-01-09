package 객체지향_프로그래밍2;

final class Singleton {		// final, 오버라이딩 불가 및 자손 클래스 정의 불가
	private static Singleton s = new Singleton();		// private
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {		// public static임 인스턴스가 이미 생성되어 있음
		if(s == null) {
			s = new Singleton();
			
		}
		
		return s;
	}
}
