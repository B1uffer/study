package 날짜와시간_형식화;

import java.time.*;
import java.time.chrono.*;
import java.util.*;

public class ChronoTest {

	public static void main(String[] args) {
		
		LocalDate kDate = LocalDate.of(1999, 12, 31);
		JapaneseDate jDate = JapaneseDate.of(1999, 12, 31);
		
		System.out.println(kDate.equals(jDate));
		System.out.println(kDate.isEqual(jDate));

	}

}
