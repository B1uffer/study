package ch4;						// {}

import java.util.*;		// Scanner 클래스를 사용하기 위해서 추가하는것! 매우 중요!

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환
		
		System.out.println(tmp);
		
		// input = 5;
		
		// input = scanner.nextInt();		//주대표 코드
		
		if(input==0)	{
			System.out.println("입력하신 숫자는 0입니다.");
			
		}
		
		if(input!=0)	{
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.", input);
			
		}	
		
		scanner.close();		// 메모리 누수를 위해 반드시 close를 해주어야함.
		
	}		// main의 끝

}
