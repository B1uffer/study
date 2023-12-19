package 조건문과_반복문;

import java.util.Scanner;

public class ex28_do_while문 {

	public static void main(String[] args) {
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
				
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input != answer);	// input이 answer과 다를 경우 참이기 때문에 위 문장들을 반복한다.
		
		System.out.println("정답입니다.");	// input == answer일 경우

	}

}
