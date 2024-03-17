package 날짜와시간_형식화;

import java.time.*;
import java.time.format.*;

public class ex27_DateFormatter2 {

	public static void main(String[] args) {
		
		// parse()에는 오버로딩 된 메서드가 여러 개 있는데 대표적으로 두 개 쓰인다
		// static LocalDateTime parse(CharSequence text)
		// static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
		
		LocalDate newYear = LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		
		// ISO_LOCAL_DATE, ISO_LOCAL_TIME 그리고 ISO_LOCAL_DATE_TIME의 차이점은???????
		
		LocalDate date = LocalDate.parse("2001-01-01");
		LocalTime time = LocalTime.parse("23:59:59");
		LocalDateTime dateTime = LocalDateTime.parse("2001-01-01T23:59:59");
		
		// ofPattern()으로도 파싱 가능
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime endOfYear = LocalDateTime.parse("2015-12-31 23:59:59", pattern);
		
		System.out.println(newYear);
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(endOfYear);
	}

}
