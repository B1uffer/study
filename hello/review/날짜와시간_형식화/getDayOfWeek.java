package 날짜와시간_형식화;

public class getDayOfWeek {
	
	convertDateToDay c = new convertDateToDay();
	
	public int getDayOfWeek(int year, int month, int day) {
		
		return c.convertDateToDay(year, month, day)%7 + 1;
		
	}
	
}
