package ch5;						// 무작위 빙고에 입력하기

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {

		final int SIZE = 5;
		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) { // i는 0부터 4까지

			for (int j = 0; j < SIZE; j++) { // j는 0부터 4까지

				bingo[i][j] = i * SIZE + j + 1; // 배열의 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화함

			}

		}

		for (int i = 0; i < SIZE; i++) {

			for (int j = 0; j < SIZE; j++) {

				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);		// 배열에 저장된 값들을 뒤섞는다
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
				// tmp를 이용해 bingo[i][j]와 임의로 선택된bingo[x][y]을 바꿈
				
			}

		}
		
		do {
			
			for(int i=0; i < SIZE; i++)	{
				
				for(int j=0; j < SIZE; j++)	{
				
				System.out.printf("[%2d] ", bingo[i][j]);
				
				
				}
				
				System.out.println();
				
			}
			System.out.println();
			
			System.out.printf("1 ~ %d의 숫자를 입력하셈! (종료는 0번) --> ", SIZE * SIZE);
			String tmp = scanner.nextLine();	// tmp에 입력받은 내용을 저장함
			num = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
			
			outer : 
				for(int i=0; i < SIZE; i++)	{
					for(int j=0; j < SIZE; j++)	{
						
						if(bingo[i][j] == num)	{
							
							bingo[i][j] = 0;
							
							break outer;	// 2중 for문을 벗어나는 구문
							
						}
						
					}
					
				}
			
			
			
		}	while(num!=0);			// do while문
		

	} // main의 끝

}
