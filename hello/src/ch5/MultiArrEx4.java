package ch5;						// 퀴즈 만들기

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
		
		String[][] words = {
				
				{"chair", "의자"},
				{"computer","컴퓨터"},
				{"integer", "정수"}		// 3행 2열, 0~2 / 0~1
				
		};

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < words.length;i++)	{
			
			System.out.printf("Q%d. %s의 뜻은? -->", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1]))	{
				
				System.out.printf("정답이에요, 축하합니다! %n%n");
				
			}	else	{
				System.out.printf("틀렸음 ㅋㅋ 정답은~ %s 였습니다! 푸하하 %n%n", words[i][1]);
				
			}
			
		}	// for문의 끝
		
	}		// main의 끝

}
