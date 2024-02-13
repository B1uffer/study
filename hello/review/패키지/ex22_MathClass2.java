package 패키지;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex22_MathClass2 {

	public static void main(String[] args) {
		
		// 삼각함수와 지수, 로그에 대해서
		
		int x1 = 1, y1 = 1;		// (1, 1)
		int x2 = 2, y2 = 2;		// (2, 2)
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		double a = c * sin(PI/4);	// PI는 파이값임
		double b = c * cos(PI/4);
		// double b = c * cos(toRadians(45)); , 라디안은 삼각함수의 단위임
		
		out.println(a);
		out.println(b);
		out.println(c);
		System.out.println();
		
		out.printf("angle = %f, rad%n", atan2(a,b));
		
		
		// 삼각함수 공부하고 다시 보기
		
	}

}
