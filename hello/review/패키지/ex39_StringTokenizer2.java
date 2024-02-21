package 패키지;

import java.util.*;

public class ex39_StringTokenizer2 {

	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		// StringTokenizer x = new StringTokenizer(y, String delim, boolean returnDelims)
		// returnDelims의 값을 true로 하면, 구분자인 +-*/=()도 토큰으로 간주된다.
		
		// 특히, 구분자로 여러 문자들을 지정해둔 것을 잘 보자.
		// StringTokenizer는 단 한 문자의 구분자만 사용할 수 있기 때문에, "+-*/=()" 얘네 전체가 하나의 구분자가 아니라,
		// 각각의 문자가 모~두 구분자라는 것이다.
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			// StringTokenizer x = new StringTokenizer(y, String delim, boolean returnDelims)의 nextToken에 의한 출력값

		}
	}

}
