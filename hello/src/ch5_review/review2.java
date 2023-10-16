package ch5_review;

// << 메소드 구현 연습>>


class asdf {
	
	static void hello() {
		
		System.out.println("Hello!");
		
	}
	
	
}












public class review2 {

	public static void main(String[] args) {
			
		//========================================
		//                   복습
		//========================================
		// 2장 변수 (기본 자료형)
		
		String s = "문자";

		// String은 '자료형'입니다.
		// s는 '변수명' 입니다.
		// s는 '(할당)값' 입니다.
		// 해석) String 자료형의 "문자"값이 할당된 변수 s
		// 2장 복습 문제)
		int i = 10;
		// int(정수) 자료형인 i의 값에는 10이 할당되어있다.
		
		short sh = 5;
		// short(정수) 자료형인 sh의 값에는 5가 할당되어있다.
		
		char ch = 'c';
		// char(문자) 자료형인 ch의 값에는 c가 할당되어있다.
		
		
		// 3장 (연산자)
		boolean bo;
		// 3장 복습문제
		//각 행마다 b의 값은?
		bo = true && false;	// and, false  
		bo = true && true;	// and, true
		bo = false || false;	// or, false
		bo = true || false;		// or, true
		bo = true && false || true;	// and, or false || true = true
		bo = (10 < 5 && 8 > 3) || 5/3 == 1; // (false) || 5/3 == 1; true
		
		int asd = 5/3;
		System.out.println(asd);
		
		
		// 00000001 = 1; 00000010 = 2; 00000100 = 4; 00001000 = 6; 00010000 = 8
		i = 11; // 0001011 8 + 2 + 1
		// 각 행마다 값은? shift <<, >>
		i = i << 3; // 00001011 에서 좌측으로 3칸이동 01011000
		i = i >> 5; // 01011000 에서 우측으로 5칸 이동 00000010	틀림
		i ++;	// 00000010값의 뒤에 1만큼 값을 증가시키는 것, 2+1 = 3	틀림
		i --; 	// 3값의 뒤에 1만큼 값을 감소시키는 것, 3-1 = 2	틀림
		// 나는 병신
		
		// 비트연산
		int a = 5;	// 4 + 1 00000101
		int b = 7;	// 4 + 2 + 1 00000111
		int c;
		
		c = a & b;	//	&는 and, 둘 다 1이면 1 아니면 00000101 
		c = a | b;	// |는 or, 둘 중 하나라도 1이면 1 00000111
		c = a ^ b;	// ^는 역, 둘이 다르면 1, 같으면 0 00000010
		
		c = a & -a;	// -a는 보수 11111010 + 00000101 = 11111111 + 00000001 = 00000000 a의 역에 1을 더해준 값
					// -a = 11111011
					// a & -a = 00000101 & 11111011 = 00000001
		
		
		// 4장 조건문 if, switch, for
		// while, break, continue, do-while
		// outer, 향상된 for문
		
		// 복습문제(if문)
		// if문을 사용하여 다음을 표현하세요.
		// (변수 x를 선언하고,x를 임의로 넣죠 Scanner 안씁니다.) 
		// 1. x가 5보다 크면 '큽니다' 출력
		// 2. x가 5와 같으면 '같습니다' 출력
		// 3. 그 외는 '작습니다' 출력
	
		int x;
		x = 6;
		if(x > 5) {
			
			System.out.println("큽니다"); 
			
		} else if(x == 5)	{
			
			System.out.println("같습니다");
			
		}	else	{
			
			System.out.println("작습니다");
			
		}
		
		
		// switch문을 사용하여 다음을 표현하세요.
		// 1. x가 0이면 '0입니다' 출력
		// 2. x가 1, 2, 3이면 '3 이하입니다' 출력
		// 2-1. 출력문을 한번만 사용할 것
		// 그 외는 '다른 값입니다' 출력
		
		x = 3;
		
		switch(x) {
		
		case 0:
			System.out.println("0입니다");
			break;
			
		case 1:
		case 2:
		case 3:
			System.out.println("3 이하입니다");
			break;
			
		default:
			System.out.println("다른 값입니다");
			break;
		
		}
		
		
		// while문을 사용하여 다음을 구현하세요.
		// 1. 10번 반복하며 'while cnt!'를 출력
		// 1-1. cnt는 카운트
		
		x = 1;
		
		while (x<=10) { // 3에서 3이랑 1이랑 비교를 핢.. 2랑 1이랑 비교를 하고 1이 출력됨, 1이랑 1을 비교하고 0이 출력됨
			
			System.out.printf("while %d\n", x); // 2가 출력됨
			x++;
			
			// 중요한건 후위연산자가 나오면 비교 먼저
		}
		
		// for문으로 무한루프를 만들고 주석처리 하기
		
		/** for(int loof=0; loof>=0; loof++) {
			
			System.out.println("섬의 마음이 떴다!!!!");
			
		} **/
		
		/** for(; ;) {
			
			System.out.println("섬의 마음이 떴니??");
			
		} **/
		
		// do while 사용하기
		// 변수로 int cnt = 0; 사용하기
		// 'Hello, while!' 출력하기 (while 조건문에 cnt가 포함되어야함)
		// 단 한번만 실행되게 하기
		
		int cnt = 0;
		
		do {
			
			System.out.println("Hello, while!");
			cnt++;
			
		} while(cnt<=1); 
		
		
		// 향상된 for문
		// 사계절로 이루어진 배열을 선언하기
		// 향상된 for문을 이용하여 출력하기
		
		String[] weather = {"봄", "여름", "가을", "겨울"}; // weather.length = 4
			
		for(String iu : weather) {	// 오른쪽이 출력할 대상, 첫번째부터 마지막 요소까지 전부 출력해라
									// String은 출력할 대상에 대해 맞추는것 
			
			// iu는 String값을 가지며, 출력할 대상의 첫번째 값으로 초기화가 된다 즉 봄
			
			// 총 4번을 반복하고 첫번째 iu는 봄 ~ 네번째 iu는 겨울이라는 String값을 가짐
			
			System.out.println(iu);
			
		}
		
		//for(int iu=0; iu < weather.length; iu++) {
			
			//System.out.println(weather[iu]); // %s String 출력
			
			// iu = 0; 0 <= 4;
			// weather[0] - > 봄
			// 0++ - > 1
			// 1 <= 4; weather[1] -> 여름
			// 1++ -> 2, 2<=4 -> weather[2] = 가을
			// 2++ -> 3, 3<=4 -> weather[3] = 겨울
			// out of bounds for length = 범위 초과 에러
			
			
			
		// }
		
		
		// 향상된 for문을 이용해 'Hello, World!'를 10번 찍어라
		// 조건 : 배열 하나를 선언하고 이용할 것
		
		String Hello = "Hello, World!";
		// int qwer = 10;
		
		for(int hi : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}) {
			
			System.out.println(Hello);
			
			
		}
		
		//for(int hi = 0; hi<qwer; hi++) {
			
			//System.out.println(Hello);
			
			// int qwer[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			
		//}
		
		
	}

}
