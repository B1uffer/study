package 패키지;

import java.util.*;

public class ex38_StringTokenizer {

	public static void main(String[] args) {
		
		// ','를 구분자로 하는 StringTokenizer를 생성해서 문자열(source)을 나누어 출력하는 예제
		
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		// StringTokenizer x = new StringTokenizer(y, String delim)
		// 문자열 y를 지정된 구분자 delim으로 나누는 StringTokenizer 타입의 인스턴스 x를 생성
		
		while(st.hasMoreTokens()) {
			// hasMoreTokens()는 boolean타입이다
			// 토큰이 남아있다면 true일것
			
			System.out.println(st.nextToken());
			// nextToken()은 다음 토큰을 반환하는 String타입 메서드
			
		}

	}

}
