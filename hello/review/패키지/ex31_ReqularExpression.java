package 패키지;

import java.util.regex.*;
// Pattern과 Matcher가 속한 패키지임

public class ex31_ReqularExpression {

	public static void main(String[] args) {
		
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");		// c로 시작하는 소문자 영단어를 컴파일한다 별도 달려있음
		
		for(int i=0; i<data.length; i++) {
			
			Matcher m = p.matcher(data[i]);
			
			if(m.matches()) {
				
				System.out.print(data[i] + ",");
				
			}
			
		}
	}

}
