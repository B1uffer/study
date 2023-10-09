package ch5;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			
			numArr[i] = (int)(Math.random() * 10);		// 0~9까지 임의의 수를 numArr[i]에 저장
			System.out.print(numArr[i]);
			
			
		}
		
		System.out.println();
		
		for(int i=0; i < numArr.length; i++)	{
			counter[numArr[i]]++;				// numArr[i]가 몇번 나타났는지 알려주는 알고리즘
			
		}
		
		for(int i=0; i < numArr.length; i++)	{
			
			System.out.println("i의 개수 : " + counter[i]);
		}

	}

}
