package 날짜와시간_형식화;

public class isLeapYear {
	
	public boolean isLeapYear(int year) {
		
		// 이새기가 윤년 판별기임
		
		return ((year%4==0) && (year%100!=0) || (year%400==0));
		
	}
}
