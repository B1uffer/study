package ch4;						// for문의 2중 중첩, 별찍기

public class FlowEx16 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)	{
			
			for(int j=1; j<=10; j++)	{		// for문의 i = 1부터 5까지, j = 1부터 10까지이므로 총 50번
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}

	}		// main의 끝

}
