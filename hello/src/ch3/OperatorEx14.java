package ch3;						// 리터럴 연산

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';				// 97
		for(int i = 0; i < 26; i++)	{
			
			System.out.print(c++);		// System.out.println(c++);을 할 경우 칸마다 한 글자씩 적히게 된다
		}
			System.out.println();		// 줄바꿈
		
			
			
		c = 'A';						// c를 A로 다시 지정한다
		
		for(int i = 0; i < 26; i++) {
			
			System.out.print(c++);		// System.out.println(c++);을 할 경우 마찬가지
		
		}
			
			System.out.println();
			
		c = '0';						// c를 0으로 다시 지정한다
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print(c++);		// '0'이라는 문자부터 10개의 문자를 순서대로 출력한다
			
		}
		
			System.out.println();
	}

}
