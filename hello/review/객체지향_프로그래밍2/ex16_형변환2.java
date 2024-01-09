package 객체지향_프로그래밍2;

public class ex16_형변환2 {

	public static void main(String[] args) {
		
		Car car = new Car();		// 참조변수 car은 Car() 인스턴스를 참조하고 있다
		//Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
		
		
		car.drive();
		fe = (FireEngine)car; // 조상타입의 참조변수를 자손타입으로 형변환
		// fe = (FireEngine)car; 에서 에러 발생
		// car은 Car 타입의 Car() 인스턴스를 참조하고 있기 때문에
		// 자손타입의 참조변수로 조상타입의 참조변수를 참조하는 것은 허용되지 않는다
		
		/* 다형성이라는 것은, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하는것.
		 * '조상' 클래스 타입의 참조변수로 '자손' 클래스의 인스턴스를 참조하는 것이다
		 * 조상 - > 자손
		 * 
		 * 자손클래스 타입의 참조변수로 조상클래스 타입의 인스턴스를 참조할 수는 없다.
		 * '자손' 클래스 타입의 참조변수로 '조상' 클래스 타입의 인스턴스를 참조할 수 없다.
		 * 
		 * 자손 - > 조상 (x)
		*/
		fe.drive();
		
		car2 = (Car)fe;	// 자손타입의 참조변수 fe를 조상타입으로 형변환
		car2.drive();
		

	}

}
