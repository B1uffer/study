package 배열;

public class ex06_최대값과최소값 {

	public static void main(String[] args) {
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}

	// score[0]의 값으로 max와 min을 초기화한 후에
	// score[1]부터 max와 min인 score[0]과 비교한 후에 배열의 마지막 요소까지 비교하여 max에는 가장 큰 값이
	// min에는 가장 작은 값이 저장된다.