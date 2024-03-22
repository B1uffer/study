package 컬렉션_프레임워크;

import java.util.*;

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
		
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 5);
		System.out.println(Arrays.toString(arr7));
		Arrays.setAll(arr7, i -> (int) (Math.random()*5) + 1);
		System.out.println(Arrays.toString(arr7));
		
		System.out.println();
		
		int[] arr8 = {3, 2, 0, 1, 4};
		int idx1 = Arrays.binarySearch(arr8, 2);
		System.out.println("Arrays.binarySearch : " + idx1);
		
		System.out.println("정렬합니다 비키십쇼");
		Arrays.sort(arr8);
		idx1 = Arrays.binarySearch(arr8, 2);
		System.out.println("Arrays.binarySearch : " + idx1);
		
		System.out.println();
		
		int[] arr9 = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12}, {21, 22}};
		System.out.println(Arrays.toString(arr9));
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println();
		
		String[][] str2D1 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.equals(str2D1, str2D2));
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		
		
	}
	
}
