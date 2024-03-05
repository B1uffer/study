package 날짜와시간_형식화;

import java.util.*;

public class ex03_calendar3 {

	public static void main(String[] args) {
		
		// 두 개의 시간 데이터로부터 초 단위로 차이를 구한 다음, 시분초로 바꿔서 출력하는 예제
		
		final int[] TIME_UNIT = {3600, 60, 1};	
		// 큰 단위를 앞에 놓기
		
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		// time1을 10시 20분 30초로 설정한다
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// time2를 20시 30분 10초로 설정
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis() / 1000);
		// Math.abs();
		
		System.out.println("time1과 time2의 차이는" + difference + "초 입니다");
		
		
		String tmp = "";
		
		for(int i=0; i < TIME_UNIT.length; i++) {	// TIME_UNIT.length = 3
			
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			// TIME_UNIT[0] = 3600, TIME_UNIT_NAME[0] = "시간"
			difference %= TIME_UNIT[i];
			// difference = difference/TIME_UNIT[i]
			
			// 가장 큰 단위인 시간 단위(3600초)로 나누고, 남은 나머지를 다시 분 단위(60초)로 나누면 그 나머지는 초 단위의 값이 됨
			// 반복문에서는 TIME_UNIT 배열값을 순서대로 difference와 나누니까 차례대로 3600, 60, 1로 나누게 된다
			// 반복문을 통과하면 tmp에는 다 나누고 남은 초 단위의 값만 남게 된다
		}
		
		System.out.println("시분초로 변환하면 " + tmp + "입니다");
	}

}
