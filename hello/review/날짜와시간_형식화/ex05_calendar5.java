package 날짜와시간_형식화;

import java.util.*;

public class ex05_calendar5 {

	public static void main(String[] args) {
		
		// roll()의 예외
		
		Calendar date = Calendar.getInstance();
		
		date.set(2024, 2, 5);
		// 작성시기인 2024년 3월 5일
		System.out.println(toString(date));
		
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
		
		date.set(2024, 4, 31);
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
		// roll()의 예외
		
	}

	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
		
		// toString()은 String 타입으로 값을 반환하기 때문에 반드시 date.get(Calendar.MONTH) 다음에 1을 더해줘야 한다.
		// 왜냐하면 Calendar.MONTH 자체는 0~11이지만 String값으로 반환하면 걍 그대로 나오기 때문
		
	}
}
