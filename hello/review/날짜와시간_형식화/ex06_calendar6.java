package 날짜와시간_형식화;

import java.util.*;

public class ex06_calendar6 {

	public static void main(String[] args) {
		
		// 커맨드라인으로 년과 월을 입력하면 달력을 출력하는 예제
		
		if(args.length != 2) {
			
			// main()의 String[] args의 용도에 대해서
			// java 클래스로 "프로그램을 실행하면" JVM은 길이가 0인 String배열을 먼저 생성하고, main()메소드를 호출할 때 매개값으로 전달함
			//
			//String[] args = {};		JAVA 프로그램 실행 시 길이가 0인 String 배열이 생성
			// public Static void main(String[] args)		main()의 매개변수가 됨
			//
			// 만약, java 클래스 뒤에 공백으로 구분된 문자열 목록을 주고 실행하게 되면
			// String[] args = {"", "", "", "", ... , ""};
			//
			// 문자열 목록으로 구성된 String[] 배열이 생성되고, main() 메서드를 호출할 때 매개값으로 전달됨
			// public String void main(String[] args)에 위의 배열값들이 전달된다
			//
			// 자세한건 matinTset 클래스 참조
			
			System.out.println("Usage : java CalendarEx6 2024 03");
			return;
			
		}
		
		int year = Integer.parseInt(args[0]);		// 2024
		int month = Integer.parseInt(args[1]);		// 2
		//int date = Integer.parseInt(args[2]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();		// 시작
		Calendar eDay = Calendar.getInstance();		// 끝
		
		sDay.set(year,  month-1, 1);	// year년 month-1월 1일로 설정함
		// MONTH의 경우 0~11이기 때문에 1을 빼줘야 함
		// 2024년 3월 1일은 sDay.set(2024, 2, 1)이 되어야 한다
		// 왜냐하면, month는 int값이고 Integer.parseInt()를 통해 args[1]배열값을 바꿔주었기 때문에
		// month 자체는 Calendar 클래스의 영향을 받지 않기 때문이다
		// 
		// 다만 sDay.set()에 들어가는 순간 Calendar 패키지의 영향을 받기 때문에 MONTH = 3이면 4월이 된다
		// 따라서 month - 1 = MONTH를 해줘야 함
		
		eDay.set(year, month, 1);
		// sDay는 당해월이기 때문에 month-1을 해준 것이고
		// eDay는 그 다음월이기 때문에 month를 그대로 쓴다
		
		System.out.println(toString(sDay));
		System.out.println(toString(eDay));
		System.out.println();
		
		eDay.add(Calendar.DATE, -1);		// 다음달의 첫 날에서 하루를 빼면 현재달의 마지막 날이 됨, 3월 -> 2월
		System.out.println(toString(sDay));
		System.out.println(toString(eDay));	
		System.out.println();
		
		// 첫번째 요일이 무슨 요일인지 알아내기
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		System.out.println("START DAY OF WEEK : " + START_DAY_OF_WEEK);
		// 요일은 1~7이며 1이 일요일이고 7이 토요일이다
		
		// eDay에 지정된 날짜 DATE를 가져온다
		END_DAY = eDay.get(Calendar.DATE);
		System.out.println("END DAY : " + END_DAY);
		
		System.out.println();
		
		System.out.println(" " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SUN MON TUE WEN THU FRI SAT");
		
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {		// 1 = i < 5
			
			System.out.print("    ");
			
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; n++, i++) {		// n = 5, 1 = i <= 29
			
			System.out.print((i < 10) ? "   " + i : "  " + i);
			if(n%7 == 0) {
				
				System.out.println();
				
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(" " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {
			
			
			System.out.print("   ");
			
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			
			System.out.print((i < 10) ? "  " + i : " " + i);
			
			if(n%7 == 0) {
				// 왜 n%7 == 0 조건문인가?
				// i = 1부터 END_DAY가 될때까지 ++ 되고
				// n은 i와는 독립적으로 START_DAY_OF_WEEK부터 제한없이 계속 ++ 된다
				// 다만 반복문에 i에 제한이 있기 때문에 무한반복 걱정 없이 쓸 수 있는 것
				// i = 1일 때, n = 5이고
				// i = 2일 때, n = 6이고
				// i = 3일 때, n = 7이다
				// 여기서 반복문 첫번째 구문인 System.out.print((i<10) ? "  " + i : " " + i); 가 먼저 실행되고 
				// i<10이기 때문에 "  " + i가 출력된다
				// 그 다음, 조건문인 n%7 == 0에서 n = 7이기 때문에 조건이 성립하여 System.out.println()에 의해 다음 줄로 넘어가는 것이다
				//
				// 즉, i와 n이 같은 반복문에서 i - > n 순서대로 ++ 되지만 결과는 i = 2, n = 6으로 다른 숫자가 되기 때문에 이 달력이 성립하는 것
				
				System.out.println();
				
			}
			
		}
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
		// 개병신아 date.get(Calendar.MONTH)에 + 1 좀 까먹지마라
	}
}
