package 날짜와시간_형식화;

import java.util.*;

public class ex09_calendar9 {

	public static void main(String[] args) {

		// 날짜 계산을 위한 메서드들
		
		getDayOfWeek g = new getDayOfWeek();
		dayDiff d = new dayDiff();
		convertDateToDay cn1 = new convertDateToDay();
		convertDayToDate cn2 = new convertDayToDate();
		
		System.out.println("2014. 5. 31 : " + g.getDayOfWeek(2014, 5, 31));
		System.out.println("2012. 6. 01 : " + g.getDayOfWeek(2012, 6, 1));
		System.out.println("2014. 5. 01 - 2014. 4. 28 : " + d.dayDiff(2014, 5, 1, 2014, 4, 28));
		System.out.println("2015. 6. 29 : " + cn1.convertDateToDay(2015, 6, 29));
		System.out.println("735778 : " + cn2.convertDaytoDate(735778));

	}

}
