package 변수;

import java.util.*;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 자리 정수를 하나 입력해주세요. > ");
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input);		// 문자열을 입력하면 int 형변환에서 에러가 발생함
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num = %d%n", num);

	}

}
