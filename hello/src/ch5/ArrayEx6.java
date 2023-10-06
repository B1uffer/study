package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫번째 값으로 max을 초기화함

		System.out.println(max);

		int min = score[0]; // 배열의 첫번째 값으로 min을 초기화함

		for (int i = 1; i < score.length; i++) { // 배열의 첫번째 값은 score[0], 초기화 값이므로 i = 1부터 지정함으로서 두번째 값부터 읽을 수 있게끔 함

			if (score[i] > max) {
				
				max = score[i];

			} else if (score[i] < min)

				min = score[i];

		} // for문 끝
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	} // main 끝

}
