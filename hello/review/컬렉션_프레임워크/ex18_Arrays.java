package 컬렉션_프레임워크;

import java.util.Arrays;

public class ex18_Arrays {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2D : " + Arrays.deepToString(arr2D));
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr2D.length : " + arr2D.length);
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println("arr5 : " + Arrays.toString(arr5));
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println("arr6 : " + Arrays.toString(arr6));
		
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7 : " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7 : " + Arrays.toString(arr7));
		
		System.out.println();
		
		for(int i : arr7) {		// i < int[5]
			
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println("별의 갯수를 한 번 볼까?" + Arrays.toString(graph));
			System.out.println(new String(graph) + i);
			
		}
		
		System.out.println();
		
		String[][] str2D1 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println("str2D1 : " + Arrays.deepToString(str2D1));
		System.out.println("str2D2 : " + Arrays.deepToString(str2D2));
		
		System.out.println();
		
		System.out.println(Arrays.equals(str2D1, str2D2));
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr : " + Arrays.toString(chArr));
		System.out.println("binarySearch() : " + Arrays.binarySearch(chArr, 'B'));
		
		Arrays.sort(chArr);
		System.out.println("정렬했다");
		System.out.println("chArr : " + Arrays.toString(chArr));
		System.out.println("binarySearch() : " + Arrays.binarySearch(chArr, 'B'));
		
	}

}
