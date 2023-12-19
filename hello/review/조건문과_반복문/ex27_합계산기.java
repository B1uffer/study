package 조건문과_반복문;

import java.util.Scanner;

public class ex27_합계산기 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)>");
		
		while (flag) {
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {	// num이 0이 아니라면 true
				sum += num;
				
			} else {	// num이 0이라면
				flag = false;	// flag를 false로 만들고 while을 false로 만들어서 닫아버린 후 합계로 넘어감
				
			}
		}
		
		System.out.println("합계 : " + sum);

	}

}
