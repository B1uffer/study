package 날짜와시간_형식화;

import java.time.*;
import java.time.format.*;


public class Parsing_formatTest {

	public static void main(String[] args) {
		
		// 파싱과 포맷 테스트
		
		LocalDate date = LocalDate.of(2016, 1, 2);
		
		String yyyymmdd = DateTimeFormatter.ISO_LOCAL_DATE.format(date);
		System.out.println(yyyymmdd);
		String yyyymmdd2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(yyyymmdd2);
		
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(formatter);
		String shortFormat = formatter.format(LocalDate.now());
		System.out.println(shortFormat);
		
		System.out.println();
		
		LocalDate newDate = LocalDate.parse("2001-01-01");
		System.out.println(newDate);
		LocalTime newTime = LocalTime.parse("23:59:59");
		System.out.println(newTime);
		LocalDateTime newDateTime = LocalDateTime.parse("2001-01-01T23:59:59");
		System.out.println(newDateTime);
		
		System.out.println();
		
		//ofPattern()
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime endOfYear = LocalDateTime.parse("2015-12-31 23:59:59", pattern);
		
		System.out.println(endOfYear);
		
	}

}
