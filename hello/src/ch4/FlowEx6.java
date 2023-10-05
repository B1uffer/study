package ch4;						// switch문

import java.util.*;

public class FlowEx6 {

	public static void main(String[] args) {
		
		System.out.print("현재 월을 입력하세요.>");
		
		/** int month = sc.nextInt();		// 화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month)	{
		
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			
			case 6 : case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
				
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
				
			default:
			case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		
		} **/
	
		
		
		try(Scanner sc=new Scanner(System.in))	{	// try - catch 이 문구가 scanner.close를 대신함
			
			int month = sc.nextInt();		// 화면을 통해 입력받은 숫자를 month에 저장
			
			switch(month)	{
			
				case 3:
				case 4:
				case 5:
					System.out.println("현재의 계절은 봄입니다.");
					break;
				
				case 6 : case 7: case 8:
					System.out.println("현재의 계절은 여름입니다.");
					break;
					
				case 9: case 10: case 11:
					System.out.println("현재의 계절은 가을입니다.");
					break;
					
				default:
				case 12: case 1: case 2:
					System.out.println("현재의 계절은 겨울입니다.");
			
			}
		
		} catch (Exception e) {			// catch문은 오류가 나면 실행
			
			System.out.println("에러발생!" + e.toString());
			
			
		}	finally {	// try - catch문 다음 오류가 나건말건 무조건 실행
			
			
			
		}
		
	}		// main의 끝

}
