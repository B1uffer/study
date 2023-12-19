package 배열;

import java.util.Scanner;

public class ex20_좌표에_X표하기 {

	public static void main(String[] args) {

		final int SIZE = 10; // final로 선언된 변수는 상수값으로, 변경할 수 없음
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				// 1 2 3 4 5 6 7 8 9
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 } // 9

		};

		// 1행에 행번호를, 1열에 열번호를 저장함
		for (int i = 1; i < SIZE; i++) { // 1<= i < 10
			board[0][i] = board[i][0] = (char) (i + '0');

		}

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요.(종료는 0)>");
			String input = scanner.nextLine();

			if (input.length() == 2) { // input.length가 2일 경우 즉 두글자를 입력했을 경우
				x = input.charAt(0) - '0'; // 문자를 숫자로 변환한다
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) { // x와 y가 모두 0인 경우
					break;
				}
			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			// shipBoard[x-1][y-1]의 값이 1이면 o를, 아니면 x를 board[x][y]에 저장한다
			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'o' : 'x';

			// 배열 board의 내용을 화면에 출력한다
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.print(board[i][j]); // board[i]는 1차원
				}
				System.out.println();
			}

		}

	}

}
