package 배열;

public class ex18_다차원배열 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {		// score[][]의 행에 관련된 for문
			for(int j=0; j<score[i].length; j++)	{		// score[][]의 열에 관련된 for문
			System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
			System.out.println("sum = " + sum);
	}

}
