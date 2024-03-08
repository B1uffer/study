package 날짜와시간_형식화;

import java.text.*;

public class ex17_ChoiceFormat2 {

	public static void main(String[] args) {
		
		String pattern = "60#D|70#C|80<B|90#A";
		// 패턴임
		// 배열대신 패턴을 활용해서 간결하게 처리할 수 있음
		// 패턴은 구분자 #, < 두 가지를 제공한다
		// limit#value의 형태를 사용한다
		
		// #는 경계값을 범위에 포함시키지만, <는 포함시키질 않음
		// 따라서 90은 A이지만, 80은 C이다 80<B, 90#A
		
		int[] source = {91, 90, 80, 88, 70, 52, 60};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i=0; i<source.length; i++) {
			
			System.out.println(source[i] + " : " + form.format(source[i]));
			
		}
		
	}

}
