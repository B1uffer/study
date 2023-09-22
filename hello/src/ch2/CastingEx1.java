package ch2;						// 형변환 (캐스팅, casting) 방법

public class CastingEx1 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score = " + score);		// int는 정수형이기 때문에 정수형으로 출력됨. 반올림은 하지 않는다 
		System.out.println("d = " + d);				//	double은 실수형이기 때문에 소숫점 자리까지 나타낸다.
		
		// 형변환 후에도 피연산자인 d에는 아무런 변화가 없다.
		

	}

}
