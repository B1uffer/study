package ch3;

public class OperatorEx18 {

	public static void main(String[] args) {
		
		double pi = 3.141592;								// double로 지정
		double shortpi = Math.round(pi * 1000) / 1000.0;	// round 메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림을 하고 그 결과를 정수로 돌려주는 메서드
															// 3.141592 * 1000 = 3141.592인데 round 메서드에 의해 반올림을 하고 정수로 변환하면 3142가 된다.
		System.out.println(shortpi);						// 3142 / 1000 = 3.142

	}

}
