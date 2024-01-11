package 객체지향_프로그래밍2;

public class ex21_매개변수의다형성 {

	public static void main(String[] args) {
		
		// Product, Tv2, Computer, Buyer 클래스
		// 이 예제는 메서드에 조상 클래스의 매개변수를 집어넣으면 자손 클래스의 인스턴스 변수를 집어넣어도 괜찮다는걸 보여줌
		// 따라서 다수의 클래스를 하나의 메서드에 집어넣고자 할때, 종류 즉 부모 클래스가 동일하다면 간편하게 해결할 수 있다
		
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		
		System.out.println("잔액은" + b.money + "원입니다.");
		System.out.println("현재 포인트는" + b.bonusPoint + "입니다.");
		

	}

}
