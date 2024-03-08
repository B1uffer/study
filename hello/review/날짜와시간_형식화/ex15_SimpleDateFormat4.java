package 날짜와시간_형식화;

import java.util.*;
import java.text.*;

public class ex15_SimpleDateFormat4 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + " 의 형태로 입력해주세요.(예 : 2015/12/31)");
		System.out.print("- > ");
		
		while(s.hasNextLine()) {
			
			try {
				
				inDate = df.parse(s.nextLine());
				break;
				
			} catch(Exception e) {
				
				System.out.println("병신아 날짜를" + pattern + " 의 형태로 다시 입력해주세요.(예 : 2015/12/31)");
				
			}
			
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		Calendar today = Calendar.getInstance();
		long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(60*60*1000);
		
		System.out.println("입력하신 날짜와 현재 날짜와는 " + day + " 시간 만큼의 차이가 있습니다.");
		
	}

}
