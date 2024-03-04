package 날짜와시간_형식화;

import java.util.*;

public class ex01_calendar1 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		// 기본적으로 현재 날짜와 시간으로 설정된다
		System.out.println(today);
		// 걍 today만 넣으면 java.util.GregoryianCalendar 클래스에 관한 정보들이 나온다
		
		System.out.println("당해년도 : " + today.get(Calendar.YEAR) + "년");
		System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH) + "월");
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR) + "주 째");
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH) + "주 째");
		
		// DATE와 DAY_OF_MONTH와 같은 말이며 같은 결과가 출력된다
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE) + "일");
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR) + "일");
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK) + "(2는 월요일, 1은 일요일)");
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "번째 요일");
		System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR) + "시");
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE) + "분");
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND) + "초");
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		
		// 천분의 1초를 시간으로 표시하기 위해 3,600,000으로 나눔(1시간  = 60 * 60초)
		System.out.println("TimeZone(-12~+12) : " + today.get(Calendar.ZONE_OFFSET) + "이게 머임");
		
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE) + "일");
	}

}

		// getInstance()를 통해 얻은 인스턴스는 기본적으로 현재 시스템의 날짜와 시간에 대한 정보를 담고 있음
		// 원하는 날짜나 시간으로 설정하려면, set 메서드를 사용해야함
		
		// public final static int YEAR = 1;
		// 이건 int get(int field)를 이용해서 원하는 필드의 값을 얻어오는 방법
		
		// get메서드의 매개변수로 쓰이는 int값들은 Calendar에 정의된 static 상수임.
		
		// get(Calendar.MONTH)로 얻어오는 값의 범위는 0~11이다.
		// 따라서 get(Calendar.MONTH)로 얻어오는 값이 0이면 1월을 의미하며, 11이면 12월을 의미한다.

