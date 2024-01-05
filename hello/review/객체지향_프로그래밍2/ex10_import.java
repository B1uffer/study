package 객체지향_프로그래밍2;

import java.text.SimpleDateFormat;		// import 작성
import java.util.Date;

public class ex10_import {

	public static void main(String[] args) {
		
		Date today = new Date();	// 객체 생성
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/DD");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
		
		// 출력
		
		System.out.println("오늘의 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
		

	}

}
