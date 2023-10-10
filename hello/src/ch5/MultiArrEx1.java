package ch5; // 다차원 배열, 가변 배열_좌표에 x표시 하기

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {

		final int SIZE = 10;
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				// 1 2 3 4 5 6 7 8 9 (0 ~ 8)
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9 (0 ~ 8)

		}; // byte

		for (int i = 1; i < SIZE; i++) { // i는 0~8

			board[0][i] = board[i][0] = (char) (i + '0');

		} // for문 끝

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.printf("좌표를 입력하셈! (종료는 00임 ㅎ) -->");
			String input = scanner.nextLine(); // 화면에 입력받은 내용을 input에 저장

			if (input.length() == 2) { // input의 길이가 2라면, 즉 두글자를 입력했다면

				x = input.charAt(0) - '0'; // 문자를 숫자로 변환함
				y = input.charAt(1) - '1'; // 마찬가지로 숫자로 변환

				if (x == 0 && y == 0)
					break;

			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {

				/**
				 * input의 길이가 2가 아니거나, x가 0보다 작거나 x가 SIZE보다 크거나, y가 0보다 작거나 혹은 y가 size보다 컸을
				 * 때(SIZE = 0 ~ 8)
				 **/

				System.out.println("잘못 입력했어요! 다시 입력하셈 ㅋㅋ");
				continue;

			} // while문 안에 있는 if문 끝

			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
			// shipBoard[x-1][y-1]의 값이 1이면 'o'를, 아니면 x를 board[x][y]에 저장한다.

			// while문 끝

			for (int i = 0; i < SIZE; i++) { // 배열 board의 내용을 화면에 출력해준다.

				System.out.println(board[i]); // 1차원 배열 board[i]
				System.out.println();
			}

		} // main 끝
	}

}
