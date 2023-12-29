package 객체지향_프로그래밍1;

public class Car3 {
	// Car3의 인스턴스 변수, 즉 참조변수
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto, manual
	int door;			// 문의 갯수
	
	Car3() {
		
		this("white", "auto", 4);		// Car3(String color, String gearType, int door)을 참조 
		
	}
	
	Car3(Car3 c) {				// 인스턴스 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	// 이 코드는 Car3 클래스의 참조변수(String colorm String gearType, int door)를 매개변수(Car3 c)로 선언한 생성자임
	// 인스턴스 상태를 전혀 알지 못해도 똑같은 상태의 인스턴스를 추가로 생성할 수 있음
	}
	
	Car3(String color, String gearType, int door) {
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
