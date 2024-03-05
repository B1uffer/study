package 날짜와시간_형식화;

public class ex08_calendar8 {

	public static void main(String[] args) {
		
		//몇 개월인지만 계산하는 것이니까 일은 적지말자. 100개월 나온다
		String date1 = "202402";
		String date2 = "202403";
		String date3 = "00000000000";
		// 년과 월을 각각 substring으로 잘라서 정수로 변환한다
		
		System.out.println(Integer.parseInt(date1.substring(0,4)));
		System.out.println(Integer.parseInt(date1.substring(4)));
		// 정수형으로 바꾼 후 출력하니까 0은 출력 안됨
		System.out.println(Integer.parseInt(date3));
		System.out.println(date3);
		System.out.println();
		
		// 2024년에 12를 곱해서 월로 변환한 다음, 뺄셈을 하면 개월차를 구할 수 있다
		
		int month1 = Integer.parseInt(date1.substring(0,4))*12 + Integer.parseInt(date1.substring(4));
		// substring(0,4)에서 4에 해당하는 자리는 제외하고 문자열을 나눈다
		// date1 = "20240214"에서 0~4는 20240, 4에 해당하는 0을 빼고 출력하면 2024
		System.out.println(month1);
		
		int month2 = Integer.parseInt(date2.substring(0,4))*12 + Integer.parseInt(date2.substring(4));
		System.out.println(month2);
		
		System.out.println(date1 + "과 " + date2 + "의 차이는 " + Math.abs(month1 - month2) + " 개월임.");
	}

}
