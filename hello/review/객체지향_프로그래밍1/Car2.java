package 객체지향_프로그래밍1;

public class Car2 {

	String color;
	String gearType;
	int door;
	
	Car2(String color, String gearType, int door) {
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
	
		Car2() {
			this("white", "auto", 4);		// Car2(String color, String gearType, int door)을 호출함
		}
		
		Car2(String color) {		// 매개변수가 String color
			this(color, "auto", 4);		// 마찬가지로 Car2(String color, String gearType, int door)을 호출함
			
		}
	
}
