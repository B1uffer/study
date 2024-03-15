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
		
	}

}
