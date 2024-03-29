package 컬렉션_프레임워크;

public class ex28_AsciiPrint {

	public static void main(String[] args) {
		
		// 아스키 프린트
		
		char ch = ' ';
		
		// 공백(' ') 이후의 문자들을 출력한다
		for(int i=0; i < 95; i++) {
			
			System.out.print(ch++);
			
		}

	}

}
