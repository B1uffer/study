package 패키지;

import java.util.regex.*;

public class ex34_정규식4 {

	public static void main(String[] args) {
		
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println("source : " + source);
		
		int i = 0;
		while(m.find()) {
			// matcher m.find()로 정규식 source와 일치하는 부분을 찾으면
			System.out.println(++i + "번째 매칭 : " + m.start() + "~" + m.end());
			// 그 위치를 start()와 end()를 통해 알 수 있다
			
				
			m.appendReplacement(sb, "drunken");
			// broken을 drunken으로 치환해서 sb에 저장함
			// appendReplacement(Stringbuffer sb, String replacement)를 통해 원하는 문자열(replacement)로 치환할 수 있음
			// 치환된 결과인 sb에 저장된다.
			
		}
		
		m.appendTail(sb);
		System.out.println("Replacement count : " + i);
		System.out.println("result : " + sb.toString());
		

	}

}
