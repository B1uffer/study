package 객체지향_프로그래밍2;

public class ex15_형변환 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = (Car)fe;		// Car타입의 참조변수로 FireEngine의 참조변수인 fe를 변경하는것이므로 생략 가능
		// car.water(); 의 경우 조상타입의 참조변수로 자손타입의 인스턴스를 부를 순 없다
		
		fe2 = (FireEngine)car;	// FireEngine타입의 참조변수(자손)로 Car타입의 참조변수(조상)를 변경
		fe2.water();
		// 자손타입의 참조변수로 조상타입의 인스턴스를 불러온다

	}

}
