package 패키지;

import java.util.*;
import static java.util.Objects.*;

public class ex26_Objects클래스 {

	public static void main(String[] args) {
		
		String[][] str2D = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		
		System.out.println("str2D = {");
		
		for(String[] tmp : str2D) {
			
			System.out.println(Arrays.toString(tmp));
			
		}
		
		
		System.out.println("}");
		
		System.out.println();
		
		System.out.println("str2D2 = {");
		
		for(String[] tmp : str2D2) {
			
			System.out.println(Arrays.toString(tmp));
			
		}
		
		System.out.println("}");
		
		System.out.println("equals(str2D, str2D2) = " + Objects.equals(str2D, str2D2));
		System.out.println("deepEquals(str2D, str2D2) = " + Objects.deepEquals(str2D, str2D2));
		
		// static import문을 사용했음에도 불구하고 앞에 Objects.를 붙여주는 이유?
		// Object 클래스의 메서드와 이름이 같기 때문에 충돌이 일어난다. 즉 컴파일러가 구별을 못함
		// 따라서 앞에 클래스의 이름 Objects를 붙여줄 수 밖에 없다.
		
		
		System.out.println("isNull(null) = " + isNull(null));
		System.out.println("nonNull(null) = " + nonNull(null));
		System.out.println("hashcode(null) = " + Objects.hashCode(null));
		System.out.println("toString(null) = " + Objects.toString(null));
		System.out.println("toString(null, \"\") = " + Objects.toString(null, ""));
		System.out.println();
		
		Comparator c = String.CASE_INSENSITIVE_ORDER;		// 대소문자를 구분하지 않는 비교
		// String 클래스에 정의된 Comparator을 불러온 뒤 compare()을 사용한다
		System.out.println("compare(\"aa\", \"bb\") = " + compare("aa","bb",c));
		System.out.println("compare(\"bb\", \"aa\") = " + compare("bb","aa",c));
		System.out.println("compare(\"AB\", \"ab\") = " + compare("ab","AB",c));
	}

}
