package 컬렉션_프레임워크;

import java.util.*;

public class ex35_Properties1 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// prop에 (key, value)를 저장한다
		prop.setProperty("timeout", "30");		// setProperty(String key, String value)
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// prop에 저장된 요소들을 "Enumeration"을 이용해서 출력함
		Enumeration e = prop.propertyNames();		// Enumeration propertyNames() : 목록의 모든 key가 담긴 Enumeration을 출력함
		
		while(e.hasMoreElements()) { 
			
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
			
		}
		
		System.out.println();
		
		prop.setProperty("size", "20");		// size를 20으로 변경함
		System.out.println("size = " + prop.getProperty("size"));		// 지정된 key인 size의 value를 반환한다
		System.out.println("capacity = " + prop.getProperty("capacity", "20"));		// key를 찾지 못하면 20을 반환한다
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		System.out.println();
		
		System.out.println(prop);		// prop에 저장된 요소들을 출력함
		System.out.println();
		
		prop.list(System.out);		// prop에 저장된 요소들을 화면(System.out)에 출력함
		
	}	

}
