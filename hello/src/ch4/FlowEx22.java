package ch4; // 향상된 for문

public class FlowEx22 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		/** for (int i = 0; i < arr.length; i++) {

			System.out.printf("%d ", arr[i]);

			System.out.println();

			for (int tmp : arr) {

				System.out.printf("%d ", tmp);
				sum += tmp;

			}

			System.out.println();
			System.out.println("sum = " + sum);


			
		}		// for문의 끝 **/

		/** for (int i = 0; i < arr.length; i++) 

			System.out.printf("%d ", arr[i]);

			System.out.println();

			for (int tmp : arr) {

				System.out.printf("%d ", tmp);
				sum += tmp;

			}

		 
			System.out.println();
			System.out.println("sum = " + sum); **/

		 for(int i=0; i<10; i++)
			 System.out.println("Hello!");
		 
		 for (int i=0; i<10; i++) { System.out.println("Hello!"); }

	}		//main의 끝

}
