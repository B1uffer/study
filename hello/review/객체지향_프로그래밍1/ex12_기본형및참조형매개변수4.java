package 객체지향_프로그래밍1;

public class ex12_기본형및참조형매개변수4 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));
		

	}
	
	static void printArr(int[] arr) {		// 배열의 모든 요소를 출력함
		System.out.print("[");
		
		for(int i : arr) {
			System.out.print(i+", ");		// i부터 arr까지
		}
		System.out.println("]");
		
	}
	
	static int sumArr(int[] arr) {			// 배열의 모든 요소의 합을 반환함
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];		// 합
			
		}
		
		return sum;		// static 'int'이기 때문에 반환값도 int로

		
	}
	
	static void sortArr(int[] arr) {			// 배열을 오름차순으로 정렬함
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
}
