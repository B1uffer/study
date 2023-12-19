package 배열;

public class ex19_다차원배열_학생총점평균 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("============================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;		// for문이 반복될때마다 sum은 0으로 초기화된다
			float avg = 0.0f;	// 마찬가지로 avg도 초기화된다
			
			korTotal += score[i][0];	// i행 1열
			engTotal += score[i][1];	// i행 2열
			mathTotal += score[i][2];	// i행 3열
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);	// i=0일때 j=0이면 sum은 score[0][0]
			
			}
			
			avg = sum / (float)score[i].length; // 평균 계산, score[][]은 int이기 때문에 실수인 float로 형변환
			System.out.printf("%5d %5.1f%n", sum, avg);		// 여기에서 줄이 나뉜다
		}
		
		System.out.println("==============================");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);

	}

}
