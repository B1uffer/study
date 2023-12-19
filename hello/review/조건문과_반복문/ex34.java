package 조건문과_반복문;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		outer: while (true) { // while문의 이름은 outer
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하시는 메뉴(1~3)를 선택해주세요.(종료:0)>");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);		// 이게 menu

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) { // 1<=menu<=3의 역
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;

			}

			for (;;) {		// for문을 통해 메뉴를 선택한 후 해당 연산을 반복적으로 수행할 수 있게 했다
				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0) {
					break;		// break 후에 outer인 while문을 빠져나가지 못해서 while의 처음으로 돌아감
				}

				if (num == 99) {
					break outer;	// while문을 완전히 빠져나가게 됨

				}

				switch (menu) {		// switch문의 조건식이 menu
				case 1:
					System.out.println("result = " + num * num);
					break;

				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break;

				case 3:
					System.out.println("result = " + Math.log(num));
					break;
				}
			}

		}

	}

}
