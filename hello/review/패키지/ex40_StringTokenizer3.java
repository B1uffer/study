package 패키지;

import java.util.*;

public class ex40_StringTokenizer3 {

	public static void main(String[] args) {
		
		// 문자열에 포함된 데이터가 두 가지 종류의 구분자로 나뉘어 있을 때, 두 개의 StringTokenizer와 이중 반복문 while을 사용해 처리하는 방법
		
		
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		// 여기서 source를 지정된 구분자 |로 한번 나눈다 **
		
		while(st.hasMoreTokens()) {
			
			String token = st.nextToken();
			// st에서 while문 한 바퀴에 하나씩 나누고 남은 토큰을 반환하는 token 인스턴스를 생성함
			// 지금 source의 상황 : 1, 김천재, 100, 100, 100가 token 인스턴스에 저장됨
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			// 여기서 token 인스턴스에 대해 구분자 ,로 한번 더 나눈다 **
			
			// 지금 token의 상황 : 1, 김천재, 100, 100, 100을 ,로 나누는 StringTokenizer 타입의 st2 인스턴스가 생성됨
			
			
			while(st2.hasMoreTokens()) {
				
				System.out.println(st2.nextToken());
				// 여기서 st2의 토큰들을 반환한다.
				
			}
			
			System.out.println("-----");
			
		}

	}

}
