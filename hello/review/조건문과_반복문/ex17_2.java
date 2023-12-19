package 조건문과_반복문;

import java.util.Scanner;

public class ex17_2 {

	public static void main(String[] args) {
		
		int num = 0;	// num을 초기화함
		
		System.out.println("*을 출력할 라인의 수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);	// 입력받은 문자열(tmp)를 int로 변환, num을 초기화함
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
