package ch4;						// 1부터 10까지의 합을 구하는 예제

public class FlowEx13 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++)	{
			
			sum += i;	// sum = sum + i;
			System.out.printf("1부터 %2d까지의 합 : %2d%n", i, sum);		// %2d에서 2는 띄어쓰기의 거리
			
		}

	}	// main의 끝

}
