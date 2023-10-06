package ch5;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];		// iArr1과 iArr2는 똑같은 값
	//	int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i=0; i < iArr1.length; i++)	{
			
			iArr1[i] = i + 1;	// 1부터 10까지의 숫자를 순서대로 배열에 넣음
			
		}
		
		for(int i=0; i < iArr2.length; i++)	{
			iArr2[i] = (int)(Math.random() * 10);		// 1~10까지의 값을 배열에 저장함
			
		}
		
		for(int i=0; i < iArr1.length; i++) {
			
			System.out.print(iArr1[i] + ", ");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	
	}		// main의 끝
	
}
