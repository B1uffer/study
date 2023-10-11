package ch5;						// 2행 3열 x 3행 2열 = 2행 2열

public class MultiArrEx3 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				
				{1, 2, 3},
				{4, 5, 6}
				
		};
		
		int[][] m2 = {
				
				{1, 2},
				{3, 4},
				{5, 6}
				
		};

		final int ROW = m1.length;		// final은 상수, m1의 행 길이 1 ~ 2
		final int COL = m2[0].length;	// m2 안의 열 길이 1 ~ 2
		final int M2_ROW = m2.length;	// m2의 행 길이 1 ~ 3
		
		int [][] m3 = new int[ROW][COL];		// m3는 2행 2열
		
		for(int i=0; i < ROW; i++)	{
			
			for(int j=0; j < COL; j++)	{
				
				for(int k=0; k < M2_ROW; k++)	{
					
					m3[i][j] += m1[i][k] * m2[k][j];		// m1과 m2를 서로 곱하는 식, m2의 행의 길이까지
					
				}
				
			}
			
		}
		
		for(int i=0; i < ROW; i++)	{		// i는 final int row니까 m1의 행의 길이, 1~2까지
			
			for(int j=0; j < COL; j++)	{		// j는 m2의 열의 길이, 1~2까지 즉 2행 2열이 됨
				
				System.out.printf("%3d ", m3[i][j]);
				
				
			}
			
			System.out.println();
			
		}
		
		
	}		// main의 끝

}
