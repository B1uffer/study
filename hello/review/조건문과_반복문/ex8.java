package 조건문과_반복문;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		
		
		System.out.print("당신의 주민등록번호를 입력하세요. (012345-1234567)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();

		// 입력받은 번호의 8번째 문자를 gender에 저장함
		char gender = regNo.charAt(7);		// char형이기 때문에 case에 작은따옴표를 반드시 적어줘야함.

		switch (gender) {

		case '1' : case '3':
			System.out.println("당신은 남자입니다.");
			break;

		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;

		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");

		}
	}

}
