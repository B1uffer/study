package 객체지향_프로그래밍1;

public class ex25_다른생성자호출 {

	public static void main(String[] args) {
		
		// Car2 참조 
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
