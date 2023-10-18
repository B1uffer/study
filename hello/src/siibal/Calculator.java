package siibal;

import java.util.Scanner;

// 계산기
// 1. Scanner로 두개의 값을 입력받습니다.
// 2. +, -, *, / % 연산을 메소드로 구현하세요.
// 3. switch문을 이용하세요.
// 4. 사용자의 입력에 따라 메소드를 사용하여 연산결과를 보여주면 됩니다.

public class Calculator {

	static int plus(int num1, int num2) {

		return num1 + num2;
	}

	static int minus(int num1, int num2) {

		return num1 - num2;
	}

	static int multi(int num1, int num2) {

		return num1 * num2;
	}

	static int divide(int num1, int num2) {

		return num1 / num2;

	}

	static int mod(int num1, int num2) {

		return num1 % num2;
	}
	

	// scanner
	Scanner scanner = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		String cal = " ";
		
		switch(cal) {
		
		case "+":
			result = plus();
		    break;
		
		case "-":
			result = minus();
			break;
			
		case "*":
			result = multi();
			break;
			
		case "/":
			result = divide();
			break;
			
		case "%":
			result = mod();
			break;
			
			default :			// default값이 입력되었을 때 scanner로 다시 돌아가는 무한루트 만들기
				System.out.println("올바른 값을 입력해주세요.");
				break;		// while문으로 무한루트를 돌리기
							// 반복문을 활용해서 무한루프 만들기
							// boolean을 활용해서 true면 플래그를 바꾸기 종료합니다 이런식
			
		}
		
		System.out.println("결과: " + result);

	}

}
