package 날짜와시간_형식화;

public class convertDayToDate {
	
	// 일단위의 값을 년월일의 형태의 문자열로 변환하여 반환한다
	
	isLeapYear l = new isLeapYear();
	endOfMonth m = new endOfMonth();
	
	public String convertDaytoDate(int day) {
	
	int year = 1;
	int month = 0;
	
	while(true) {
		
		int aYear = l.isLeapYear(year)? 366 : 365;		// 윤년이면 366일, 아니면 365일
		
		if(day > aYear) {
			
			day -= aYear;
			year++;
			
		} else {
			
			break;
			
		}
		
	}
	
	while(true) {
		
		int endDay = m.endOfMonth[month];
		
		if(l.isLeapYear(year) && month == 1) {
			
			endDay++;
			
		}
		
		if(day > endDay) {
			
			day -= endDay;
			month++;
			
		} else {
			
			break;
			
		}
	}
	
	return year + "-" + (month+1) + "-" + day;
	
	}
	
}
