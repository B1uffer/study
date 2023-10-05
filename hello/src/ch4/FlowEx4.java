package ch4;						// if - else if문

import java.util.*;

// import jdk.jfr.internal.StringPool;

public class FlowEx4 {

	public static void main(String[] args) {
		
		// int number = "안녕하세요!";		컴파일 에러
		
		var number = "안녕하세요!";	// var은 동적 자료형임, 할당하는 순간 값의 속성이 정해짐
		
		int score = 0;		// 점수를 저장하기 위한 변수
		char grade = ' ';	// 확률을 저장하기 위한 변수. 공백으로 초기화함.
		
		System.out.print("점수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		try {			// try - catch문 : 예외처리문 try catch문 사이에 있는게 
			
			score = scanner.nextInt();		// 화면을 통해 입력받은 숫자를 score에 저장
			
		} catch(Exception ime) {		// 모든 에러에 대해서 반응
			
			
			System.out.println("에러가 발생했습니다!");
			
		}
		// score = scanner.nextInt();		// 화면을 통해 입력받은 숫자를 score에 저장
		
		if(score >= 90)	{
			
			grade = 'A';		// score가 90점보다 크거나 같다면 A학점
			
		}	else if(score >= 80) {
			
			grade = 'B';		// score가 80점보다 크거나 같다면 B학점
			
		}	else if (score >= 70) {
			
			grade = 'C';		// score가 70점보다 크거나 같다면 C학점
			
		}	else {
			
			grade = 'D';		// 나머지는 D학점
			
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		scanner.close();
		

	}

}
