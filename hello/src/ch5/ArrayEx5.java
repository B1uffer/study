package ch5;						// 배열의 활용

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int sum = 0;			// 총점 저장 변수
		float average = 0f;		// 평균 저장 변수

		int[] score = {100, 88, 100, 100, 90};
		
		System.out.println(score.length);
		
		for(int i=0; i < score.length; i++)	{
			
			sum += score[i];			// 0부터 4까지의 score 변수를 sum에 합산
			
		}
		
		average = sum / (float)score.length;	// 계산 결과를 float로 얻기 위한 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}	// main의 끝

}
