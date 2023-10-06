package ch4;

public class FlowEx26 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) <= 100)		{				// i의 값을 1씩 증가시켜서 sum에 누적시킴
			
			System.out.printf("%d - %d%n", i, sum);
			
		}

	}		// main 끝

}
