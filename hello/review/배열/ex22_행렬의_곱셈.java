package 배열;

public class ex22_행렬의_곱셈 {

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
		
		final int ROW = m1.length;	// m1의 행의 길이 2행이니까 2
		final int COL = m2[0].length; // m2의 열의 길이 2열이니까 2
		final int M2_ROW = m2.length; // m2의 행의 길이 3행이니까 3
		
		// 값이 될 m3은 2행 2열
		int[][] m3 = new int[ROW][COL];	// 배열을 만드는 방법 int[][] x = new int[][];
		
		for(int i=0; i<ROW; i++) {	// ROW는 m1 행의 길이 2
			for(int j=0; j<COL; j++) {	// COL은 m2의 열의 길이 2
				for(int k=0; k<M2_ROW; k++) {
					m3[i][j] += m1[i][k] * m2[k][j]; //m3[0~1][0~1] += m1[0~1][0~2] * m2[0~2][0~1];
				}
			}
		}
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
		
	}

}
