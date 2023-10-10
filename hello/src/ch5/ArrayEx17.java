package ch5; // 사친연산을 수행하는 수식을 화면에서 입력받아 계산하여 그 결과를 보여주는 예

public class ArrayEx17 {

	public static void main(String[] args) {

		if (args.length != 3) { // 입력된 값의 개수가 3개가 아니라면,

			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0); // 프로그램을 종료합니다.

		}

		int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환함
		char op = args[1].charAt(0); // 문자열을 문자(char)로 변환함
		int num2 = Integer.parseInt(args[2]);
		int result = 0;

		switch (op) {

		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;
			
		case 'x':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
			default : System.out.println("지원되지 않는 연산임 ㅋㅋ셈");

		}
		
			System.out.println("결과 : " + result);
			
	}				// main의 끝임

}
