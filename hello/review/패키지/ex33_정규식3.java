package 패키지;

import java.util.regex.*;

public class ex33_정규식3 {

	public static void main(String[] args) {
		
		// 정규식의 일부를 괄호로 나누어 그룹화 하는 예제
		String source = "HP:011-1111-1111, HOME:02-999-9999";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
						// 괄호()를 통해 정규식을 세 부분으로 나누었음
						// group()으로 호출할 수 있는데, group() 또는 group(0)은 그룹으로 매칭된 문자열 전체를 나누지 않은 채로 반환함
		
		Pattern p = Pattern.compile(pattern);		// 얘가 패턴
		Matcher m = p.matcher(source);		// 얘가 패턴으로 비교한다		import java.util.regex.*;
		
		int i=0;
		while(m.find()) {
			// find()는 주어진 소스 내에서 패턴과 일치하는 부분을 찾아내면 true, 찾지 못하면 false를 반환함
			// 즉 HP:와 HOME:은 일치하지 않으니 false, 나머지 숫자들은 pattern과 일치하니까 true
			
			System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
			
		}
		
	}

}
