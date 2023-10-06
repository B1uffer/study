package ch5;

public class ArrayEx10 {

	public static void main(String[] args) {

		int[] numArr = new int[10]; // 0~9

		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i] = (int) (Math.random() * 10));

		}

		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) { // i는 0부터 8까지

			boolean changed = false; // 자리바꿈이 발생했는지에 대한 체크

			for (int j = 0; j < numArr.length - 1 - i; j++) { // j의 범위는 0부터 8-i까지 0 <= j <= 8-i
				if (numArr[j] > numArr[j + 1]) { // numArr[j]가 numArr[j+1]보다 작다면

					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp; // 자리 바꾸기

					changed = true; // 성공했으면 changed를 true로 저장함

				}

			}

			if (!changed) {
				break; // 자리바꿈이 없다면, for 반복문을 벗어난다.
			}

			for (int k = 0; k < numArr.length; k++) { // 0~9

				System.out.print(numArr[k]);

			}

			System.out.println();

		} // i의 끝

	} // main의 끝

}
