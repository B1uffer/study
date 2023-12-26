package 객체지향_프로그래밍1;

public class ex22_가변배열과오버로딩 {

	public static void main(String[] args) {
		
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate(" ", "100", "200", "300"));
		System.out.println(concatenate(" - ", strArr));	// delim, args
		// str + delim
		// System.out.println(" - ", new String[] {"100", "200", "300"});으로 합체 가능
		
		System.out.println(concatenate(", ", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(", ", new String[0]) + "]");
		System.out.println("[" + concatenate(", ") + "]");
		
		

	}
	
	static String concatenate(String delim, String... args) {		// 가변인자로 매개변수 선언
		String result = " ";
		
		for(String str : args) {
			
			result += str + delim;
			
		}
		
		return result;
	}
	
	/*
	 static String concatenate(String... args) {
	 	return concatenate(" ", args);
	 	
	 	}

		주석을 풀고 실행해보면 에러가 발생한다
		가변인자를 사용한 메서드는 오버로딩 하지 않게 주의

*/
}
