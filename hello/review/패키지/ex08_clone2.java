package 패키지;

import java.util.*;

public class ex08_clone2 {

	public static void main(String[] args) {
		
		//int[] arr= {1, 2, 3, 4, 5};
		
		//int[] arrClone = arr.clone();
		//arrClone[0] = 6;
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrClone = new int[arr.length];		// 배열 생성
		System.arraycopy(arr, 0, arrClone, 0, arr.length);		// 내용 복사
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		

	}

}
