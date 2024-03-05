package 날짜와시간_형식화;

import java.util.*;

public class ex07_calendar7 {

	public static void main(String[] args) {
		
		// calendar6에서 첫 주와 마지막 주가 이전 달, 이후 달과 연결되도록 변경한 예제
		// 먼소리냐면 3월은 31일까지니까, 31일 이후에 4월 1일, 2일, 3일 ... 이 오는 달력을 만드는 것
		
		// DAY_OF_WEEK는 당해년월일이 몇요일인지 알려준다. 1 = 일요일, 7 = 토요일
		
		if(args.length != 2) {
			
			System.out.println("ㅋㅋ ㅄ 뒤에 했던 예제좀 보고 와라 얼간아");
			return;
			
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		// 이 부분이 매우 중요함. String[] 타입인 args를 int타입으로 변환하는 과정이니까
		// 이게 없으면 매개변수가 int인 Calendar에 들어가질 않는다
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
		// eDay는 당해월의 말일로 설정한다 sDay.getActualMaximun(Calendar.DATE)
		
		System.out.println(toString(sDay));
		System.out.println(toString(eDay));
		
		System.out.println();
		
		System.out.println(sDay.get(Calendar.DAY_OF_WEEK));
		// 얘 5임 2024년 2월 1일은 목요일이니까
		System.out.println(sDay.get(Calendar.DAY_OF_WEEK) + 1);
		// 얘 6임
		System.out.println(sDay.get(Calendar.DATE));
		// 얘 1임
		System.out.println(sDay.get(Calendar.DATE) - (sDay.get(Calendar.DAY_OF_WEEK) + 1));
		// 얘 -5임
		
		
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		// 1일이 속한 주의 일요일로 날짜를 설정한다
		// 2월 1일은 목요일이니까 해당 주에 대해 속하는 일요일은 1월 28일이다 (일월화수목금토)
		// add()이기 때문에 Calendar.DATE 에다가 -sDay.get(Calendar.DAY_OF_WEEK) 만큼 더하는 것이다
		// 1 - 6  = -5
		System.out.println(toString(sDay));
		System.out.println();
		
		
		System.out.println(eDay.get(Calendar.DATE));
		// 2월은 29일까지 있다
		System.out.println(eDay.get(Calendar.DAY_OF_WEEK));
		// 29일은 목요일이다
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		// 말일이 속한 주의 토요일로 날짜를 설정한다	
		// 만약 말일이 수요일이고 Calendar.DATE는 30이라고 하자
		// 그럼 Calendar.DAY_OF_WEEK는 4가 될 것이다. 해당 요일이 30일, 수요일이니까
		// 그럼 7 - eDay.get(Calendar.DAY_OF_WEEK)는 7 - 4 = 3이 될 것이다
		// eDay.add(Calendar.DATE, 7-eDay.get(Calendar.DAY_OF_WEEK))는 전자에 후자만큼 더하는 것이니,
		// 수요일에서 시작하면 목, 금, 토요일이 된다
		// 즉 eDay.add() 안의 식은 조건없이 어떤 요일을 때려박아도 그레고리력에 의하면 7이라는 숫자를 나오게 만드는 항등식이다.
		
		// sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK + 1) 또한 마찬가지이다
		
		System.out.println(toString(eDay));
		System.out.println(eDay.get(Calendar.DAY_OF_WEEK));
		// 7이 나왔으니 2월 29일, 말일이 속한 주의 토요일로 날짜가 설정됐다
		
		System.out.println();
		System.out.println();
		
		System.out.println("  " + year + "년 " + month + "월");
		System.out.println("  SUN MON TUE WEN THU FRI SAT");
		
		
		// 시작일부터 마지막일까지(sDay - > eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력한다
		for(int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			// java에서 두 날짜를 비교하는 메서드(boolean)
			// a1.before(a2) : a1값이 매개변수 a2보다 이전이면 true
			// a1.after(a2) : a1값이 매개변수 a2보다 이후이면 true
			// a1.equals(a2) : a1값이 매개변수 a2와 같으면 true
			// Date클래스를 활용해서 밀리초 단위로 변환 후 비교해본다
			
			int day = sDay.get(Calendar.DATE);
			System.out.print((day < 10) ? "   " + day : "  " + day);
			
			if(n++%7 == 0) {
				
				System.out.println();
				
			}
			
		}
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
		
	}
}
