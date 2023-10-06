package ch5;						// 값을 서로 바꾸는 수식

public class ArrayEx7 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {

			numArr[i] = i; // numArr[]을 0~9로 초기화함
			System.out.print(numArr[i]);

		}

		System.out.println();

		// numArr = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		
		
		for (int i = 0; i < 100; i++) {
				
			int n = (int) (Math.random() * 10); // n은 0에서 9 중 하나의 값을 얻게 됨 (0~9, 총 10개)
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;			// 대표적인 위치 바꾸기 코드
			
				//	n이 5라면, numArr = 4123056789
				// n이 연속해서 7이라면, numArr = 6123054789
			
		}
				
		
		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i]);

		}
		
		System.out.println();

	} // main의 끝

}
