package 날짜와시간_형식화;

public class getDayOfWeek {
	
	convertDateToDay c = new convertDateToDay();
	
	public int getDayOfWeek(int year, int month, int day) {
		
		// 지정한 날짜의 요일을 반환한다 (1~7, 1이 일요일)
		return c.convertDateToDay(year, month, day)%7 + 1;
		
	}
	
}
