package 날짜와시간_형식화;

public class dayDiff extends convertDateToDay {
	
	public int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		
		return convertDateToDay(y1,m1,d1) - convertDateToDay(y2, m2, d2);
		
	}
}
