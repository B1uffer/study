package 날짜와시간_형식화;

import java.time.*;
import java.time.chrono.*;
import java.time.temporal.*;

public class ex22_LocalDate_LocalTime {

	public static void main(String[] args) {
		
		// 그냥 예제
		
		LocalDate today = LocalDate.now();		// 오늘이 며칠이고
		LocalTime now = LocalTime.now();		// 현재 시간
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);
		LocalTime birthTime = LocalTime.of(23, 59,59);
		
		System.out.println("today : " + today);
		System.out.println("now : " + now);		// 소숫점 아홉째자리까지 출력한다
		System.out.println("birthDate : " + birthDate);
		System.out.println("birthTime : " + birthTime);
		System.out.println();
		
		System.out.println("birthDate의 연도를 바꾸면 " + birthDate.withYear(2000));
		System.out.println("birthDate에 1일을 더하면, 윤년이 아니었을 때 " + birthDate.plusDays(1));
		System.out.println("위 구문이랑 똑같은데 ChronoUnit를 사용하면 " + birthDate.plus(1, ChronoUnit.DAYS));
		
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		// truncatedTo(ChronoUnit.HOURS)에서 truncatedTo()는 시, 분, 초를 기준으로 하위 시간들을 0으로 출력하는 메서드이다
		// 따라서 ChronoUnit.HOURS 라고 적었으니 시간을 기준으로 분, 초는 전부 0으로 출력이 된다
		// 단, truncatedTo()는 today, birthDate와 같은 LocalDate 타입에는 적용할 수 없다. 날짜는 0이 되지 않기 때문
		System.out.println();
		
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());
		// ChronoField의 범위를 알아내는 방법
		
	}

}
