package 패키지;

import java.util.*;

public class ex30_Random_Class4 extends RandomEx4 {

	public static void main(String[] args) {
		
		// 데이터베이스에 넣을 테스트 데이터를 만드는 효율적인 예제
		// RandomEx4 참조
		
		
		for(int i=0; i<RECORD_NUM; i++) {
			
			System.out.println("INSERT INTO " + TABLE_NAME + " VALUES (" + "'" + getRandArr(CODE1) + "', '" + getRandArr(CODE2) + "', '" + getRandArr(CODE3) + "');");
			// INSERT INTO ~ VALUES();는 SQL문이다 복습맨
		}
		
		

	}
	
	public static String getRandArr(String[] arr) {
		
		return arr[getRand(arr.length-1)];		// arr.legnth - 1은 int값이다
					// getRand(int n)
	}				// arr.length = 5일 경우, 5-1 = 4니까 arr[getRand(4)]를 반환하는데,
					// getRand(4)는 getRand(0, n)을 반환하며 n = 4니까 getRand(0, 4)이다
					// getRand(0, 4)는 (Math.random() * (Math.abs(4-0+1)) + Math.min(0, 4))를 반환한다
	
	public static int getRand(int n) {
		
		return getRand(0,n);
				// getRand(int from, int to)
				// n - 0 + 1 , n을 더한 값
	}
	
	public static int getRand(int from, int to) {
		
		return (int)(Math.random() * (Math.abs(to-from + 1)) + Math.min(from, to));
		// Math.abs()로 to-from + 1의 절댓값과 from과 to 중 최솟값을 더한 값을 Math.random()한 값을 반환한다
		
	}
	
}
