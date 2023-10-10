package ch5;						// 학생의 점수를 더해서 총점과 평균을 계산하고, 과목별 총점을 계산하는 예제

public class ArrayEx19 {

	public static void main(String[] args) {
		
		int[][] score = {
				
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},				// 5행 3열
				
		};				// int 닫는걸 잊지 말기
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;		// 과목별 총점 초기화
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("-------------------------");
		
		for(int i=0; i < score.length; i++)	{		// score의 길이라서 0~4
			
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);		// 번호
			
			for(int j=0; j < score[i].length; j++)	{
				
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);		// 각 클래스의 점수
				
				
			}

			
			avg = sum/(float)score[i].length;		// 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);		// 이 식에서 %n에 의해 정리가 됨, 총점과 평균
			
			
			
		}
			
		System.out.println("----------------------------------------");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
		

	}		// main의 끝

}
