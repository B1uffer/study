package ch2;						// 특수문자 다루기

public class SpecialCharEx {

	public static void main(String[] args) {
		System.out.println('\'');		// 작은따옴표 `
		System.out.println("abc\t123\b456");		//	\b에 의해서 3이 지워짐
		System.out.println('\n');		// 줄바꿈, new line 문자를 출력하고 개행
		System.out.println("하하하하하하하");
		System.out.println('\n');		// new line 포함
		System.out.println("\"hello\"");
		System.out.println("c:\\");		// 백슬래시 \를 출력하기 위해선 \\를 입력해야한다
		System.out.println("안녕하세요!\n");		// System.out.println에서 println의 ln에는 new line이 포함되어있다.
		System.out.print("유행을 선도하는\n");
		System.out.print("저입니다!\n");
		
		
		
		
		
		System.out.println("\"hello\"");
		System.out.print("\"my name is\"");
		System.out.print('\n');
		System.out.print("\"Shin DongJin\"");

	}

}
