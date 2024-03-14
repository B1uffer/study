package 날짜와시간_형식화;

import java.time.*;
import java.time.temporal.*;

public class Period_DurationTest {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2014,  1,  1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		System.out.println(pe);
		// date2 - date1 결과를 연, 월, 일로 nY, mM, lD 형태를 갖춰 각각 출력한다. date1이 특정 부분에서 date2보다 값이 크면 음수가 뜸
		
		LocalTime time1 = LocalTime.of(00, 00, 00);
		LocalTime time2 = LocalTime.of(12, 34, 56);
		
		Duration du = Duration.between(time1, time2);
		System.out.println(du);
		
		// Period와 Duration을 계산해서 출력해봤더니 Period의 경우 결과값 앞에 P가 붙고 Duration은 PT가 붙어있다
		
		long year = pe.get(ChronoUnit.YEARS);
		// ChronoUnit은 java.time.temporal 패키지에 들어있다
		long year2 = pe.getYears();
		System.out.println(year);
		System.out.println(year2);
		
		long month = pe.get(ChronoUnit.MONTHS);
		long month2 = pe.getMonths();
		System.out.println(month);
		System.out.println(month2);
		
		long day = pe.get(ChronoUnit.DAYS);
		long day2 = pe.getDays();
		System.out.println(day);
		System.out.println(day2);
		
		long sec = du.get(ChronoUnit.SECONDS);
		long sec2 = du.getSeconds();
		System.out.println(sec);
		System.out.println(sec2);
		
		long nano = du.get(ChronoUnit.NANOS);		// 얘 왜 long밖에 안됨?
		int nano2 =du.getNano();
		System.out.println(nano);
		System.out.println(nano2);
		
		System.out.println(pe.getUnits());
		System.out.println(du.getUnits());		// 이를 통해 getHours(), getMinutes()가 없다는 것을 알 수 있다
		
		System.out.println();
		
		
		// Duration을 LocalTime으로 바꿔서 getHour(), getMinute(), getSecond()를 사용하기
		
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());		
		// Duration을 LocalTime으로 바꾸는 개빡센 구문
		
		int hour = tmpTime.getHour();
		System.out.println(hour);
		int minute = tmpTime.getMinute();
		System.out.println(minute);
		int second = tmpTime.getSecond();
		System.out.println(second);
		int nano3 = du.getNano();
		System.out.println(nano3);
		
		System.out.println();
		
		// between(), until()
		
		LocalDate today = LocalDate.now();
		LocalDate myBirthDay = LocalDate.of(2010, 1, 15);
		
		//Period pe1 = Period.between(today, myBirthDay);
		Period pe1 = today.until(myBirthDay);
		System.out.println(pe1);
		long dday = today.until(myBirthDay, ChronoUnit.DAYS);
		System.out.println(dday);
		
		LocalTime endTime = LocalTime.of(19, 30);
		
		long sec3 = LocalTime.now().until(endTime, ChronoUnit.SECONDS);
		System.out.println(sec3);
		
		System.out.println();
		
		// of(), with()
		
		Period pe2 = Period.of(1, 12, 31);
		System.out.println(pe2);
		Duration du1 = Duration.of(60, ChronoUnit.SECONDS);
		System.out.println(du1);
		
		pe2 = pe2.withYears(2);
		System.out.println(pe2);
		du1 = du1.withSeconds(120);
		System.out.println(du1);
		
		
	}

}
