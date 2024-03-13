package 날짜와시간_형식화;

import java.time.*;
import java.time.temporal.*;

public class DayAfterTomorrow implements TemporalAdjuster {
	
	// import java.time.temporal.*;을 해줘야 TemporalAdjuster를 구현할 수 있다 
	@Override
	// 대체 저 개 ㅈ같은 @은 뭐임
	
	public Temporal adjustInto(Temporal temporal) {
		
		return temporal.plus(2, ChronoUnit.DAYS);
		
	}
}
