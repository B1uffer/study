package 배열;

import java.util.Arrays;

public class ex02 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		//int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100,95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;	// 1~10의 숫자를 순서대로 배열에 넣음
		}
		// 배열에 저장된 값들 출력
		for(int i=0; i<iArr1.length; i++) {
			System.out.println(iArr1[i] + ",");
		}
		
		// Arrays.toString()은 배열의 모든 요소를 문자열로 만들어서 반환함. 배열의 내용을 쉽게 알 수 있음
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);

	}

}
