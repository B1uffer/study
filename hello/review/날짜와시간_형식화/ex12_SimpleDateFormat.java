package 날짜와시간_형식화;

import java.util.*;
import java.text.*;

public class ex12_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		sdf2 = new SimpleDateFormat(" ''yy년 MMM dd일 E요일");
		System.out.println(sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
		System.out.println(sdf3.format(today));
		
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(today));
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		System.out.println(sdf5.format(today));
		
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		System.out.println(sdf6.format(today));
		
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		System.out.println(sdf7.format(today));
		
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		System.out.println(sdf8.format(today));
		// W는 월의 몇 번째 주
		
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		System.out.println(sdf9.format(today));
		// F는 월의 몇 번째 요일
		
		// 홀따옴표 '는 escape 기호이기 때문에 패턴 내에서 홀따옴표를 표시하기 위해선, 홀따옴표를 연속으로 두 번 사용해야 한다
		
	}

}
