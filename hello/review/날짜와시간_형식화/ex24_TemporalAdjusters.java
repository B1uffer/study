package 날짜와시간_형식화;

import java.time.*;		// 이새기는 걍 LocalDate LocalTime LocalDateTime ZonedDateTime 이런거 담고있음
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
// java.time.DayOfWeek.*는 '요일'과 관련된 매개변수들에 대한 메서드 등을 담고 있다, 가령 TUESDAY
import static java.time.temporal.TemporalAdjusters.*;
// java.time.temporal.TemporalAdjusters.*는 날짜 계산에 대한 메서드들을 담은 클래스이다. 가령 firstDayOfNextMonth()

public class ex24_TemporalAdjusters {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		System.out.println(today);
		p(today);
		// 이 둘이 뭔 차이임 답은 아래에 
		p(date);
		p("다음 달의 첫번째 날 : " + today.with(firstDayOfNextMonth()));
		p("이번 달의 첫 번째 날 : " + today.with(firstDayOfMonth()));
		p("이번 달의 마지막 날 : " + today.with(lastDayOfMonth()));
		p("이번 달의 첫 번째 화요일 : " + today.with(firstInMonth(TUESDAY)));
		p("이번 달의 마지막 화요일" + today.with(lastInMonth(TUESDAY)));
		p("지난 화요일 : " + today.with(previous(TUESDAY)));
		p("지난 화요일인데 오늘까지 포함함 : " + today.with(previousOrSame(TUESDAY)));
		p("다음 주 화요일 : " + today.with(next(TUESDAY)));
		p("다음 주 화요일인데 오늘까지 포함함 : " + today.with(nextOrSame(TUESDAY)));
		p("이번 달의 4번째 화요일 : " + today.with(dayOfWeekInMonth(4, TUESDAY)));
		p(today.with(dayOfWeekInMonth(1, MONDAY)));
		
	}	
	
	static void p(Object obj) {		// 걍 라인 줄이려고 메서드 추가함 ㅋㅋ 근데 얘는 매개변수를 반드시 넣어줘야하고 System.out.println()은 안넣어줘도 된다는 차이점이 있음
		
		System.out.println(obj);
		
	}
	
}
