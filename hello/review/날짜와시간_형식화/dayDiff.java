package 날짜와시간_형식화;

public class dayDiff extends convertDateToDay {
	
	public int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		
		// 두 날짜간의 차이를 일단위로 변환한다
		return convertDateToDay(y1,m1,d1) - convertDateToDay(y2, m2, d2);
		
	}
}
