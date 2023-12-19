package 객체지향_프로그래밍1;

public class ex8_JVM메모리구조2 {

	public static void main(String[] args) {
		
		System.out.println("main(String[] args)이 시작되었음");		// 1
		firstMethod();											// 2
		System.out.println("main(String[] args)이 끝났음");		// 8

	}	// 여기가 메인
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음");			// 3
		secondMethod();											// 4
		System.out.println("firstMethod()이 끝났음");				// 7
		
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음");			// 5
		System.out.println("secondMethod()이 끝났음");				// 6
	}

}
