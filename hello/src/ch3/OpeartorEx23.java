package ch3;						// 문자열의 비교 : 문자열을 비교할땐 == 대신 equals()을 사용해야함

public class OpeartorEx23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc"=="abc");
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");		// "abc"와 new String("abc")의 메모리 주소는 서로 다르기 때문에 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));		// String을 서로 비교할때 쓰는 메서드 equals()
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));		// equals()메서드를 사용해서 비교하면 true로 나온다
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIqnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));		// 대소문자 구분없이 비교하는 메서드 equalsIgnoreCase() 사용
		

	}

}
