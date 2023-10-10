package ch5; // 행렬 나타내기, 1차원 2차원

public class ArrayEx18 {

	public static void main(String[] args) {

		
		// 변수의 범위
		for(int i=0; i<10; i++) {
			
		}
		
		for(int i=0; i<10; i++) { }
		
		for(int i=0; i<10; i++) { }
		
		for(int i=0; i<10; i++) { }
		
		for(int i=0; i<10; i++) { }
		

		
		
		
		
		
		int[][] score = {

				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 } // 4행 3열

		}; // int에 마침표가 들어감

		int sum = 0;
		
		for (int i = 0; i < score.length; i++) { // 0부터 3까지 행을 나타냄 // score의 길이라서 {}의 갯수, 0~3

			for (int j = 0; j < score[i].length; j++) { // 0부터 2까지 열을 나타냄 // score[i]의 길이라서 0~2

				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

			}

		} // for문의 끝

		// 향상된 for문
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int arrSum = 0;

		for (int n : arr) {

			arrSum += n;

			// n는 1부터 10까지 들어감.

		}

		String[] name = { "철수", "영희", "민수", "경희", "똘똘이", "이씨", "박씨" };

		for (String s : name) {

			System.out.println(s);

		}

		// name이라는 변수 전체에 접근하게끔 하는 변수가 s다

		// : arr을 지정함 arr이 가진 모든 요소를 반복을 함.

		// n가 반복되면 arr의 요소가 됨

		System.out.println(arrSum);

		for (int[] tmp : score) {	// 첫번째 for문은 score 그 자체의 변수에 대한 4행을 돌리는거임

			 for (int i : tmp) {		// 

				sum += i; // ?? 

			} 

		} // for문의 끝2

		System.out.println("sum = " + sum);

	} // main의 끝

}
