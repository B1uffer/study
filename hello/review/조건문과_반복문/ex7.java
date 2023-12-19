package 조건문과_반복문;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		// 1, 2, 3중 하나를 com에 저장함
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다.");
		System.out.println("AI는" + com + "입니다.");

		if (user >= 4 || user <= 0) {

			System.out.println("올바른 값을 입력해주세요.");
		}
		switch (user - com) {

		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;

		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;

		case 0:
			System.out.println("비겼습니다.");

		}

	}

}
