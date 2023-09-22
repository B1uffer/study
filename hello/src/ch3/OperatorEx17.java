package ch3;						// 소수점 넷째자리에서 반올림하는 방법

public class OperatorEx17 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5d) / 1000.0;		// pi * 1000 = 3141.592
																// 3141.592 + 0.5 = 3142.092 가 되며 int형으로 바뀌기 때문에 3142가 된다
		System.out.println(shortPi);							// 3142 / 1000.0 = 3.142가 되며 소수점 셋째짜리까지 표현되고 넷째자리에서 반올림하는 것처럼 보이게 된다
		

	}

}
