package 날짜와시간_형식화;

import java.time.*;
import java.time.format.*;

public class ex26_DateFormatter {

	public static void main(String[] args) {
		
		ZonedDateTime zdateTime = ZonedDateTime.now();
		
		
		String[] patternArr = {"yyyy-MM-dd HH:mm:ss", "''yy년 MMM dd일 E요일''", "yyyy-MM-dd HH:mm:ss.SSS z VV", "yyyy-MM-dd hh:mm:ss a"
				, "오늘은 올해의 D번째 날입니다.", "오늘은 이달의 d번째 날입니다.", "오늘은 올해의 w번째 주입니다.", "오늘은 이달의 W번째 주입니다.", "오늘은 이달의 W번째 E요일 입니다."};
		
		for(String p : patternArr) {
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
			System.out.println(zdateTime.format(formatter));
			
		}
	}

}
