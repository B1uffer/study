package 패키지;

import static java.lang.Math.*;		// 이거 물어보기
import static java.lang.System.*;

public class ex20_MathClass {

	public static void main(String[] args) {
		
		double val = 90.7552;
		
		out.println("round(val) = " + round(val));		// 반올림
		
		val *= 100;
		
		out.println(round(val));
		out.println(round(val)/100);
		out.println(round(val)/100.0);
		
		System.out.println();
		
		out.printf("ceil(%3.1f) = %3.1f%n", 1.1, ceil(1.1));		// ceil() 걍 올림
		out.printf("ceil(%3.1f) = %f%n", -1.5, ceil(-1.5));
		
		System.out.println();
		
		out.printf("rint(%3.1f) = %f%n", -1.5, rint(-1.5));			// rint() 반올림
		
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));		// floor()는 걍 버림
		
		out.printf("rint(%f) = %f%n", 2.5, rint(2.5));
		
		// round()와 rint()의 차이점
		// round()는 2.5의 경우 일반적으로 반올림하여 2가 된다
		// rint()의 2.5는 가장 가까운 짝수쪽으로 반올림한다. 즉 2.5는 3이 아니라 2가 됨
		// rint()의 3.5는 가장 가까운 짝수인 4로 반올림한다. 와우 정말 신기하네~
		// 이에 대한건 MathTest 참조
		
	}

}
