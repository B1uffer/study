package 컬렉션_프레임워크;

import java.util.*;
import java.text.*;


public class currentTimeMillisTest {

	public static void main(String[] args) {
		
		// 현재시간 구하기
		long curTime = System.currentTimeMillis();
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = timeFormat.format(new Date(curTime));
		
		System.out.println(str);
		System.out.println(new Date(curTime));
		
		System.out.println();
		
		// 실행시간 구하기
		
		long start = System.currentTimeMillis();
		// Thread.sleep(5000);
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000 + "초");
	}

}
