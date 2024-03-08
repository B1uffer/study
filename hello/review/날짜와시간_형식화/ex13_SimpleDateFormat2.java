package 날짜와시간_형식화;

import java.util.*;
import java.text.*;

public class ex13_SimpleDateFormat2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2005, 9, 3);	// 2005년 10월 3일로 설정 month는 +1
		
		Date day = cal.getTime();
		// Calendar 타입인 cal을 Date로 변환해서 day에 집어넣음
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(day));
		
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		System.out.println(sdf2.format(day));
		
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(day));
		
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(day));
	}

}
