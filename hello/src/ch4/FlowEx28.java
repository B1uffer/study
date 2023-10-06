package ch4; // do - while 문

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {

		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100); // 1~100 사이의 임의의 수를 저장함
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100 사이의 정수를 입력해보셈 ㅋ --> ");

			input = scanner.nextInt();

			if (input > answer) {

				System.out.println("더 작은 수로 시도하셈 ㅋㅋ 허접인가");

			} else if (input < answer) {

				System.out.println("더 큰 수로 시도해보셈 ㅋㅋ 한심하내???");

			}

		} while (input != answer);

		System.out.println("와! 맞춞!");

	} // main의 끝

}
