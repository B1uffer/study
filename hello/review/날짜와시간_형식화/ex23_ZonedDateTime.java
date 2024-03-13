package 날짜와시간_형식화;

import java.time.*;

public class ex23_ZonedDateTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.of(12, 34, 56);
		
		LocalDateTime dt = LocalDateTime.of(date, time);
		
		System.out.println(dt);
		System.out.println();
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
		System.out.println(zdt);
		String strZid = zdt.getZone().getId();
		System.out.println(strZid);
		
		System.out.println();
		
		ZonedDateTime seoulTime = ZonedDateTime.now();
		System.out.println(seoulTime);
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyTime);
		
		System.out.println();
		
		// ZonedDateTime - > OffsetDateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();
		System.out.println(odt);		// zdt에서 [Asia/Seoul], ZoneId가 빠져나갔다
		// ZonedDateTime에서 OffsetDateTime으로 바꾸면 LocalDateTime + 시간대인 +09:00까진 표현되지만 ZoneId까진 표현되지 않음
	
	}

}
