package 컬렉션_프레임워크;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4};
		System.out.println("Original : " + Arrays.toString(arr));
		System.out.println("Original.length : " + arr.length);
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);		// 0~4에서 4에 해당하는 배열은 포함되지 않는다
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);		// 마찬가지로 7에 해당하는 배열은 포함되지 않는다
		System.out.println("arr6 : " + Arrays.toString(arr6));
		
		
		
	}
	
}
