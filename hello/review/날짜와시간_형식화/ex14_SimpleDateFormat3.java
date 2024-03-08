package 날짜와시간_형식화;

import java.util.*;
import java.text.*;

public class ex14_SimpleDateFormat3 {

	public static void main(String[] args) {
		
		// parse(String source)를 사용해서 날짜 데이터의 출력형식을 변환하는 방법을 보여주는 예제
		// ex11 참조
		
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date date = new Date();
		
		System.out.println(df.format(date));
		System.out.println(df2.format(new Date()));
		
		try {
			
		Date d = df.parse("2015년 11월 23일");
		// parse를 사용했기 때문에 try - catch문임
		// SimpleDateFormat의 parse(String source)는
		// 문자열 source를 날짜 Date인 인스턴스로 변환해준다
		
		System.out.println(df2.format(d));
		
			
		} catch(Exception e) {
			
			
			
		}
		

	}

}
