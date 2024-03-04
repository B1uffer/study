package 날짜와시간_형식화;

import java.util.*;

public class ex02_calendar2 {

	public static void main(String[] args) {
		
		// 두 날짜간의 차이를 구하는 예제
		
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		// 요일은 1부터 시작하기 때문에 DAY_OF_WEEK[0]은 비워둔다
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 7, 15);
		// 년, 월, 일 - > 2015년 8월 15일
		// month의 경우 get(Calendar.MONTH)처럼 0부터 시작하기 때문에 가령 8월의 경우 7로 설정해줘야 한다
		// date1.set(2015, Calendar.AUGUST, 15)처럼 할 수도 있다
		
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		// java.lang 패키지에 toString()이 들어있기 때문에 패키지를 이 클래스에 데려오지 않았으므로 toString() 메서드를 만들어줘야함
		// DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]에서 date1.get(Calendar.DAY_OF_WEEK)가 int니까 
		// 0~6에 알맞은 String이 출력된다. 다만 date1.set(2015, 7, 15)로 지정해줬기 때문에 항상 토요일만 출력된다.
		
		System.out.println("오늘(date2)은" + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일이다.");
		
		
		//두 날짜간의 차이를 얻기
		//getTimeInMillis()를 통해 천분의 일초 단위로 변환해야함
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		
		System.out.println("일(day)로 환산하면 " + difference/(24*60*60) + "일입니다.");
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
		
	}
}
