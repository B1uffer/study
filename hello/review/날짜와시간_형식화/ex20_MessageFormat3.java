package 날짜와시간_형식화;

import java.text.*;

public class ex20_MessageFormat3 {

	public static void main(String[] args) throws Exception {
		
		// parse(String soursce)를 이용해서 출력된 데이터로부터 데이터만을 뽑아내는 방법
		
		// 이거 안됨
		
		String[] data = {"INSERT INTO CUST_INFO VALUES('이자바','02-123-1234',27,'07-09');","INSERT INTO CUST_INFO VALUES('김프로','032-333-1234',33,'10-07');"};
		
		String pattern = "INSERT INTO CUST_INFO VALUES({0},{1},{2},{3});";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i = 0; i<data.length; i++) {
			
			Object[] objs = mf.parse(data[i]);
			
			for(int j=0; i<objs.length; j++) {
				
				System.out.print(objs[j] + ",");
				
			}
			System.out.println();
		}
	}

}
