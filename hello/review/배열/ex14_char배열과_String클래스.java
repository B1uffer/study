package 배열;

public class ex14_char배열과_String클래스 {

	public static void main(String[] args) {
		
		// String 클래스의 charAt(int idx)을 사용하는 방법
		
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);	// src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+") : " + ch);
		}
		
		char[] chArr = src.toCharArray();	// String이었던 src을 char[]로 변환
		
		System.out.println(chArr);	// char배열 (char[])을 출력

	}

}
