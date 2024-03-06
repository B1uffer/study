package 날짜와시간_형식화;

public class isLeapYear {
	
	public boolean isLeapYear(int year) {
		
		// 이새기가 윤년 판별기임	
		// 매개변수 year가 윤년이면 true, 아니면 false를 반환함
		return ((year%4==0) && (year%100!=0) || (year%400==0));
		
	}
}
