package 날짜와시간_형식화;

import java.time.*;
import java.time.temporal.*;

public class ex25_Period_Duration {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println("Period : " + pe);
		System.out.println();
		
		System.out.println("YEAR : " + pe.get(ChronoUnit.YEARS));
		System.out.println("MONTH : " + pe.get(ChronoUnit.MONTHS));
		System.out.println("DAYS : " + pe.get(ChronoUnit.DAYS));
		System.out.println();
		
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(12, 34, 56);		// 12시간 34분 56초
		
		Duration du = Duration.between(time1, time2);
		
		System.out.println("time1 : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("Duration : " + du);
		System.out.println();
		
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		System.out.println(tmpTime);
		System.out.println("HOUR : " + tmpTime.getHour());
		System.out.println("MINUTE : " + tmpTime.getMinute());
		System.out.println("SECOND : " + tmpTime.getSecond());
		System.out.println("NANO : " + tmpTime.getNano());
	}

}
