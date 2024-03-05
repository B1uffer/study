package 날짜와시간_형식화;

import java.util.*;

public class ex04_claendar4 {
	
	public static void main(String args[]) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 7, 31);
		// date를 2015년 8월 31일로 설정
		
		System.out.println(date);
		System.out.println(toString(date));
		System.out.println("1일 후");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("6달 전");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("31일 후");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		// roll()은 특정 필드의 값을 증가 혹은 감소시킨다.
		// 특징은 add()와 달리 다른 필드에 영향을 주지 않는다
		// 다른 필드란 가령 DATE값에 대해 roll()을 통해서 변경했을 때 DATE를 필드라고 한다
		// 따라서 다른 필드에 영향을 주지 않는다는 것은 MONTH, YEAR의 변동이 없다는 것을 의미함
		System.out.println("15일 후");
		date.roll(Calendar.DATE, 15);
		System.out.println(toString(date));
		
		System.out.println("또 16일 후");
		date.roll(Calendar.DATE, 16);
		System.out.println(toString(date));
		
		System.out.println("31일 후");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		// roll()에 대한 예외
		// 필드(Calendar.DATE)가 말일(end of month)일 때, roll()을 이용해서 월 필드(Calendar.MONTH)를 변경하면 일 필드에 영향을 미칠 수 있다
		// 그레고리력에 의하면 3월은 31일이지만 4월은 30일이기 때문
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + (date.get(Calendar.DATE) + "일");
		
	}
}
