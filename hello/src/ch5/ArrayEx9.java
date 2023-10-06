package ch5;

import java.util.Arrays;			// Arrays.toString()을 사용하기 위해 추가함

public class ArrayEx9 {

	public static void main(String[] args) {
		
		int[] code = {-4, -1, 3, 6, 11};		// 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];		// 길이는 0~9
		
		for(int i=0; i < arr.length; i++)	{
			
			int tmp = (int)(Math.random() * code.length);		//code[](0~4)의 길이만큼 무작위로 지정
			arr[i] = code[tmp];
			
		}
		
		System.out.println(Arrays.toString(arr));		
		
	}		// main의 끝

}
