package 날짜와시간_형식화;

import java.text.*;

public class ex18_MessageFormat {

	public static void main(String[] args) {
		
		String msg = "Name : {0} \nTel : {1} \nAge : {2}";
		
		Object[] arguments = {"이자바", "02-123-1234", "27", "07-09"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
		
	}

}
