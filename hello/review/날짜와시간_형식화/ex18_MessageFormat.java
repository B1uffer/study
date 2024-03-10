package 날짜와시간_형식화;

import java.text.*;

public class ex18_MessageFormat {

	public static void main(String[] args) {
		
		String msg = "Name : {0} \nTel : {1} \nAge : {2}";
		// msg = "";에서 {0}, {1}, {2}로 표시된 부분이 데이터가 출력될 자리임
		// 순차적일 필요는 없고 여러 번 반복해서 사용할 수도 있다
		// 여기서 사용되는 숫자는 배열마냥 0부터 시작해야하며 양식에 들어갈 데이터는 밑의 Object[] arguments에 지정되어 있다
		
		Object[] arguments = {"이자바", "02-123-1234", "27", "07-09"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
		
	}

}
