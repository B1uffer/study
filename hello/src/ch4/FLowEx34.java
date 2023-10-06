package ch4;					// outer이 포함된 반복문

import java.util.Scanner;

public class FLowEx34 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer : 
			while(true)		{
				
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.print("원하는 메뉴(1~3)를 선택하셈 ㅋㅋ (종료는 0번)-->");
				
				String tmp = scanner.nextLine();		// 화면에서 입력받은 내용을 tmp에 저장
				menu = Integer.parseInt(tmp);			// 입력받은 문자열(tmp)을 숫자로 변환
				
				if(menu==0)	{
					
					System.out.println("프로그램을 종료함 ㅋㅋ");
					break;
					
				}	else if (!(1<=menu && menu<=3))	{
					System.out.println("메뉴를 잘못된걸 선택함 ㅋㅋ (종료는 0번)");
					continue;
					
				}
				
				for(;;)	{
					System.out.print("계산할 값을 입력하셈! (계산 종료:0, 전체 종료:99)");
					tmp = scanner.nextLine();			// 화면에서 입력받은 내용을 tmp에 저장
					num = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환함
					
					if(num==0)
						break;				// 계산을 종료하고 for문을 벗어남
					
					if(num==99)
						break outer;		// 전체 종료. for문과 while문 모두 벗어나게됨
					
					switch(menu)	{				// switch(menu)의 menu의 값에 따라 case가 달라짐
					
					case 1:
						System.out.println("result = " + num*num);
						break;
						
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
						
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
						
					
					}
					
				}		// for(;;)문 끝
					
					
				}		// while문 끝
				
			}		//main 끝


}
