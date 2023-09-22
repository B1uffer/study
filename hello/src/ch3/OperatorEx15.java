package ch3;						// 대문자를 소문자로, 소문자를 대문자로 변환하기

public class OperatorEx15 {

	public static void main(String[] args) {
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		
		System.out.println(upperCase);
		
		char otherCase = 'b';
		char otherupperCase = (char)(otherCase - 32);		// 소문자 아스키코드에 32를 빼주면 대문자 아스키코드가 나온다
		
		System.out.println(otherupperCase);
		
		// char형과 int형간의 뺄셈연산 결과는 int형으로 나오므로 연산 후 char형으로 다시 형변환하는 과정을 거쳐야 한다.
	}

}
