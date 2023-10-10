package ch5;						// String 클래스는 char 배열에 기능을 추가한 것이다!

public class ArrayEx14 {

	public static void main(String[] args) {
		
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++)	{
			
			char ch = src.charAt(i);		// src의 i번째 문자를 ch에 저장함
			System.out.println("src.charAt("+i+") : " + ch);
			
		}

		char[] chArr = src.toCharArray(); 		//String을 char[]으로 변환함
		
		System.out.println(chArr);		//char 배열(char[])을 출력함
		
	}

}
