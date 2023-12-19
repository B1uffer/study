package 배열;

import java.util.Scanner;

public class ex21_빙고 {

	public static void main(String[] args) {
		
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];	// SIZE는 5이므로 5행 5열의 bingo[5][5]가 된다
		Scanner scanner = new Scanner(System.in);
		
		// bingo배열의 모든 요소를 1부터 SIZE*SIZE(5*5=25)까지의 숫자로 초기화한다
		// 이 for문에 의해 Math.random()은 최대 25까지의 값으로 정해진다
		for(int i=0; i<SIZE; i++) {	// i는 SIZE보다 작아야 한다 0<=i<5
			for(int j=0; j<SIZE; j++) { // j도 마찬가지
				bingo[i][j] = i * SIZE + j + 1;	// bingo 내 각 요소들은 (0~4)*5 + (0~4) + 1의 값으로 정해진다
				
			}
		}
		
		// 배열에 저장된 값들을 뒤섞는다
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random() * SIZE);	// x값은 무작위 숫자에 SIZE를 곱한것
				y = (int)(Math.random() * SIZE);	// y도 무작위 숫자에 SIZE를 곱한것
				// 단, 이전 이중for문에 의해 Math.random() * SIZE의 값은 최대 25까지로 제한된다
				
				
				// bingo[i][j]와 임의로 선택된 값 bingo[x][y]를 바꿈
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
				
			}
		}
		
		// do while 반복문, 한번은 반드시 실행되는 반복문이다
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.printf("%2d", bingo[i][j]);
					
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
			String tmp = scanner.nextLine();		// 여기에 입력받고 tmp에 저장
			num = Integer.parseInt(tmp);		// tmp에 저장된 값을 int인 num값으로 변환해서 저장함
			
			// outer를 사용하여 이중반복문을 탈출하는것
			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0에 저장함
			outer:
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE; j++) {	// bingo[0][0] ~ bingo[4][4]까지 다 훑어보고
						
						if(bingo[i][j]==num) {	// 입력받은 숫자와 bingo[i][j]가 같다면
							bingo[i][j] = 0;	// bingo[i][j] = 0으로 초기화한다
							break outer;	// 여기서 탈출하여 for문으로 돌아온다
						}
					}
				}
				
		} while(num!=0); // do - while문은 num!=0일동안 반복된다 num=0이 될 경우 false가 되어 종료됨
	}

}
