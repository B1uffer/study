package 날짜와시간_형식화;

import java.util.*;
import java.text.*;
import java.io.*;

public class ex21_MessageFormat4 {

	public static void main(String[] args) throws Exception {
		
		// 이전 예제들은 데이터를 객체배열에 직접 초기화했는데, 데이터가 바뀔때마다 매번 배열을 변경해야하고 컴파일도 해줘야하니까 불편함
		// 따라서 Scanner를 통해 파일로부터 데이터를 라인별로 읽어서 처리하도록 변경한 예제

		String tableName = "CUST_INFO";
		String fileName = "data4.text";
		String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";
		
		Scanner s = new Scanner(System.in);
		
		String pattern = "{0},{1},{2},{3}";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		while(s.hasNextLine()) {
			
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
			
		}
		
		s.close();		// Scanner에서 사용한 파일을 닫는다
		
		// 실행 시 입력받을 데이터가 저장된 파일명도 지정하도록 예제를 변경하면, 파일의 이름이 바뀌더라도 다시 컴파일 하지 않아도 되니까 더 편리할것임
	}

}
