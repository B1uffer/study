package 날짜와시간_형식화;

import java.time.*;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.of(12, 34, 56);
		System.out.println(date);
		System.out.println(time);
		System.out.println();
		
		LocalDateTime dt1 = LocalDateTime.of(date, time);
		System.out.println(dt1);
		
		LocalDateTime dt2 = date.atTime(time);
		System.out.println(dt2);
		
		LocalDateTime dt3 = time.atDate(date);
		System.out.println(dt3);
		
		LocalDateTime dt4 = date.atTime(12, 34, 56);
		System.out.println(dt4);
		
		LocalDateTime dt6 = date.atTime(LocalTime.of(12, 34,56));
		System.out.println(dt6);
		
		LocalDateTime dt5 = time.atDate(LocalDate.of(2015, 12, 31));
		System.out.println(dt5);
		
		LocalDateTime dt7 = date.atStartOfDay();
		System.out.println(dt7);
		
		System.out.println();
		
		LocalDateTime dateTime = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
		System.out.println(dateTime);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		System.out.println();
		
		LocalDate date1 = dateTime.toLocalDate();
		System.out.println(date1);
		
		LocalTime time1 = dateTime.toLocalTime();
		System.out.println(time1);
		
		System.out.println();
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dateTime.atZone(zid);
		System.out.println(zdt);
		
		ZonedDateTime zdt2 = LocalDate.now().atStartOfDay(zid);
		System.out.println(zdt2);
		System.out.println();
		
		ZoneId nyid = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyid);
		System.out.println(nyTime);
		
		ZoneOffset krOffset = ZonedDateTime.now().getOffset();
		System.out.println(krOffset);
		ZoneOffset krOffset2 = ZoneOffset.of("+9");
		System.out.println(krOffset2);
		// int krOffsetInSec = krOffset.get(ChronoField.OFFSET_SECONDS); ChronoField에서 안됨
		
		System.out.println();
		
		ZonedDateTime zdt3 = ZonedDateTime.of(date, time, zid);
		System.out.println(zdt3);
		OffsetDateTime odt = OffsetDateTime.of(date, time, krOffset);
		System.out.println(odt);
		
		// ZoneDateTime - > OffsetDateTime
		OffsetDateTime odt111 = zdt3.toOffsetDateTime();
		System.out.println(odt111);
	}

}
