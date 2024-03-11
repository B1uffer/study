package 날짜와시간_형식화;

import java.text.*;

public class ex19_MessageFormat2 {

	public static void main(String[] args) {
		
		// 반복문으로 하나 이상의 데이터 집합을 출력하는 예제
		
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + "VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'')";
		
		Object[][] arguments = {{"이자바", "02-123-1234", "27", "07-09"}, {"김프로", "032-333-1234", "33", "10-07"}};
		
		for(int i=0; i<arguments.length; i++) {
			
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
			
		}
	}

}
