package 날짜와시간_형식화;

public class convertDateToDay {
	
	// 년월일을 입력받은 후 일단위로 변환한다
	
	isLeapYear l = new isLeapYear();
	endOfMonth m = new endOfMonth();
	
	public int convertDateToDay(int year, int month, int day) {
		
		int numOfLeapYear = 0;		// 윤년의 수
		
		// 전년도까지의 윤년의 수를 구하기
		for(int i=1; i<year; i++) {
			
			if(l.isLeapYear(i)) {
				
				numOfLeapYear++;
				
			}
			
		}
		
		// 전년도까지의 일수를 구함
		int toLastYearDaySum = (year-1) * 365 + numOfLeapYear;
		
		// 올해의 현재 월까지의 일수를 계산하기
		int thisYearDaySum = 0;
		
		for(int i=0; i<month - 1; i++) {
			
			thisYearDaySum += m.endOfMonth[i];
			
		}
		
		// 윤년이고, 2월이 포함되어 있으면 1일을 증가시킨다
		if(month > 2 && l.isLeapYear(year)) {
			
			thisYearDaySum++;
			
		}
		
		thisYearDaySum += day;
		
		return toLastYearDaySum + thisYearDaySum;
		
	}
	
}
