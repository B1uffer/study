package 컬렉션_프레임워크;

import java.util.*;

public class ex38_Properties4 {

	public static void main(String[] args) {
		
		// 시스템 속성을 가져오는 방법
		// System 클래스의 getProperties()를 호출하면 시스템과 관련된 속성이 저장된 Properties를 가져올 수 있음
		// 이 중에서 원하는 속성을 getProperty()를 통해 얻을 수 있음
		
		Properties sysProp = System.getProperties();
		
		System.out.println("java version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		System.out.println(sysProp.getProperty("java.version.date"));
		sysProp.list(System.out);
		

	}

}
