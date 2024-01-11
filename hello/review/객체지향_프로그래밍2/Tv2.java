package 객체지향_프로그래밍2;

class Tv2 extends Product {
	Tv2() {		// 조상클래스의 생성자 Product(int price)를 호출함 
		
		super(100);		// Tv의 가격은 100
		
	}
	
	
	// Object 클래스의 toString을 오버라이딩함
	public String toString() {
		return "Tv";
		
	}
}
