package 객체지향_프로그래밍2;

class Computer extends Product {

	Computer() {		// 메서드 생성
		// 조상클래스의 Product(int price) 호출
		super(200);
		
	}
	
	// object 클래스를 오버라이딩으로 불러올땐 public을 붙이기
	public String toString() {
		return "computer";
	}
}
