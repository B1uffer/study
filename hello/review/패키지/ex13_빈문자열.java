package 패키지;

public class ex13_빈문자열 {

	public static void main(String[] args) {
		
		char[] cArr = new char[0];		// 길이가 0인 char배열을 생성해서 char형 배열 참조변수 cArr을 초기화해줌
		// char[] cArr = {}; 와 같다
		
		String s = new String(cArr);
		// String s = new String(""); 와 같다
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");

	}

}
