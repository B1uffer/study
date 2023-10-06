package ch5; // 배열의 복사

public class ArrayEx3 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // int[]에서 []을 기억할 것

		for (int i = 0; i < arr.length; i++) { // 0~4

			arr[i] = i + 1; // arr[i]에 1~5까지 저장한다

		}

		System.out.println("[변경 전]");
		System.out.println("arr.length : " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] : " + arr[i]);

		}

		int[] tmp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {

			tmp[i] = arr[i]; // 배열 arr에 저장된 값들을 배열 tmp에 복사하는 것이다 arr[i] = i + 1;
		}

		arr = tmp;				// tmp에 저장된 값을 arr에 저장함. int[] tmp = new int[arr.length * 2];
		
		System.out.println("[변경 후]");
		System.out.println("arr.length : " + arr.length);
		
		for(int i=0; i<arr.length; i++)	{
			
			System.out.println("arr["+i+"] : " + arr[i]);
			
		}
		
		
		
	} // main의 끝

}
