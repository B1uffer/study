package 패키지;

import java.util.regex.*;
// Pattern과 Matcher가 속한 패키지임

public class ex31_정규식 {

	// data라는 문자열배열에 담긴 문자열 중, 지정한 정규식과 일치하는 문자열을 출력하는 예제임
	
	
	public static void main(String[] args) {
		
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");		// c로 시작하는 소문자 영단어를 컴파일한다 별도 달려있음
		// Pattern은 정규식을 정의하는 데 사용됨
		
		for(int i=0; i<data.length; i++) {
			
			Matcher m = p.matcher(data[i]);
			// Matcher은 정규식(패턴)을 데이터와 비교하는 역할을 함
			
			if(m.matches()) {
				
				System.out.print(data[i] + ",");
				
			}
			
		}
	}

}
