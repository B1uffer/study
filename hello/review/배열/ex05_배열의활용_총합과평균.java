package 배열;

public class ex05_배열의활용_총합과평균 {

	public static void main(String[] args) {

		int sum = 0; // 총점을 저장하기 위한 변수
		float average = 0f; // 평균 저장

		int[] score = { 100, 88, 100, 100, 90 };
		
		System.out.println(score[0]);
		
		for (int i = 0; i < score.length; i++) {

			sum += score[i];

		}

		average = sum / (float) score.length; // 형변환

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);

	}

}
