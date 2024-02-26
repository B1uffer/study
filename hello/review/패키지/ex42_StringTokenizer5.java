package 패키지;

import java.util.*;

public class ex42_StringTokenizer5 {

	public static void main(String[] args) {
		
		// 구분자를 ','로 하는 문자열 데이터를 String 클래스의 split()과 StringTokenizer로 잘라서 결과를 비교하는 예제
		// split()은 빈 문자열도 토큰으로 인식한다
		// StringTokenizer는 빈 문자열을 토큰으로 인식하지 않는다
		
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println(result.length);
		System.out.println();
		
		
		for(int i=0; i<result.length; i++) {
			
			System.out.print(result[i] + "|");		// result = data.split(",")
			
		}
		
		System.out.println("개수 : " + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens();i++) {
			
			System.out.print(st.nextToken() + "|");		// st = new StringTokenizer(data, ",")
			
		}
		
		System.out.println("개수 : " + i);
	}

}
