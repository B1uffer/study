package 날짜와시간_형식화;

import java.util.*;
import java.text.*;

public class ex12_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		sdf2 = new SimpleDateFormat(" ''yy년 MMM dd일 E요일");
		System.out.println(sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
		System.out.println(sdf3.format(today));
	}

}
