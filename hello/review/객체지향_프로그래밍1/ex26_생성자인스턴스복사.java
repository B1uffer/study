package 객체지향_프로그래밍1;

public class ex26_생성자인스턴스복사 {

	public static void main(String[] args) {
		
		// Car3 참조
		
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	// c1의 복사본인 c2를 생성함
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
		c1.door = 100;
		System.out.println("c1.door = 100; 수행 후");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
