package 패키지;

import java.util.*;

public class ex29_Random_Class3 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			System.out.print(getRand(5,10) + ",");
			
		}
		
		System.out.println();
		
		int[] result = fillRand(new int[10], new int[] {2,3,7,5});
					// fillRand(int[] arr, int[] data)
		
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] fillRand(int[] arr, int from, int to) {
		// 배열 arr을 from과 to의 범위값들로 채워서 반환한다
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = getRand(from, to);
			
		}
		
		return arr;
		
	}
	
	public static int[] fillRand(int[] arr, int[] data) {		// data = {2, 3, 7, 5}
		// 배열 arr을 배열 data에 있는 값들로 채워서 반환한다
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = data[getRand(0,data.length-1)];		// data.length = 4, 4-1 = 3
			
		}
		
		return arr;
		
	}
	
	public static int getRand(int from, int to) {
		// from과 to 범위의 정수값을 반환함(int). from과 to 모두 범위에 포함된다
		return (int)(Math.random() * (Math.abs(to-from)+1));		// abs()는 절댓값 반환 함수
		
	}
}
