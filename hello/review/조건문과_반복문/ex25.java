package 조건문과_반복문;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		System.out.println("숫자를 입력하세요. (예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	// scanner로 입력한 값을 tmp에 문자열로 저장
		num = Integer.parseInt(tmp);		// 문자열인 tmp를 int로 변환하여 num에 저장
		
		while(num != 0) {
			
			sum += num%10;	// num/10의 나머지를 sum에 저장 - > 각 자리수의 합을 구하기 위한 식
			
			System.out.printf("sum=%3d, num=%d%n", sum, num);
			
			num/=10;		// num = num/10으로 초기화
		}
		System.out.println("각 자리수의 합 : " + sum);
	}

}
