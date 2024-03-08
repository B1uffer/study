package 날짜와시간_형식화;

import java.text.*;

public class ex16_ChoiceFormat {

	public static void main(String[] args) {
		
		double[] limits = {60, 70, 80, 90}; // 반드시 낮은 값부터 큰 순서로 적기
		String[] grades = {"D", "C", "B", "A"}; // double[] limits[]와 String[] grades의 배열 갯수를 똑같게 해야한다
		
		// limits[] 는 범위의 경계값을 저장하는데 사용되었고
		// grades[] 는 범위에 포함된 값을 치환할 문자열을 저장하는 데 사용됨
		
		int[] source = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i=0; i<source.length; i++) {
			
			System.out.println(source[i] + " : " + form.format(source[i]));
			
		}
		
	}

}
