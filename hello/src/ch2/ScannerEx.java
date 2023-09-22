package ch2;

import java.util.*;		// Scanner을 사용하기 위해 추가하는 명령어

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//	Scanner 클래스의 객체 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();		//	입력받은 내용을 input에 저장함
		int num = Integer.parseInt(input);		//	입력받은 문자열을 숫자로 변환함
		
		System.out.println("입력받은 내용 : " + input);			// input에서 결과값이 출력되지 않음
		System.out.printf("num=%d%n", num);					//	마찬가지로 출력되지 않음

	}

}
