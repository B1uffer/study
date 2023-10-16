package ch5_review;

import java.util.Scanner;

public class TV {

	public static void main(String[] args) {
			
		//========================================
		//                   복습
		//========================================
		// 2장 변수 (기본 자료형)
		
		String s = "문자";

		// String은 '자료형'입니다.
		// s는 '변수명' 입니다.
		// s는 '(할당)값' 입니다.
		// 해석) String 자료형의 "문자"값이 할당된 변수 s
		// 2장 복습 문제)
		int i = 10;
		// 해석) i는 int인 자료형인데 얘는 정수값이 할당될 수 있는 변수이다. 그런데 이새끼는 10이 할당되어 있다.
		short sh = 5;
		// 해석) sh는 short인 자료형인데 이새기는 int보다는 덜한 정수값 (short < int)이 할당될 수 있는 변수야. 
		// 그런데 sh한테는 5가 할당되어 있어.
		char ch = 'c';
		// 해석) c는 char인 자료형이다. 얘는 아스키값(ascii)을 저장할 수 있는 자료형인데
		// 이 개새기한테는 'c'가 할당되어 있고 a가 65니까 얘는 67임.
		
		// 3장 (연산자)
		boolean bo;
		// 3장 복습문제
		//각 행마다 b의 값은?
		bo = true && false;	  // false
		bo = true && true;	  // true 
		bo = false || false;	  // false
		bo = true || false;	  // true
		bo = true && false || true; // false (틀림)
		bo = (10 < 5 && 8 > 3) || 5/3 == 1; // true (틀림)
		
		i = 11; // 00001011
		// 각 행마다 값은? 2진수의 옆으로 밀기
		i = i << 3; // 모름	// 01011000 에서 01011000 8 + 16 + 64 = 씨발
		i = i >> 5; // 모름	// 01011000 00000010 이니까 2
		i ++; // 12 // 2에서 1 증가 3
		i --; // 10 // 3에서 1 감소 2
		// 나는 병신
		
		// 비트연산
		int a = 5;	// 00000101
		int b = 7;	// 00000111
		int c;
		// 각 행마다 값은?
		c = a & b;	// 답) 5 x 7 = 35 // and 둘 다 1이면 1, 아니면 0 00000101	
		c = a | b;	// 5 % 7 = 5/7 = 0 // or 둘중에 하나라도 1이면 1 00000111
		c = a ^ b;	// 좆같음 틀리면 1, 같으면 0이겠죠? // 00000010 2
		
		c = a & -a;	// a는 00000101 - 정 반대에서 해주는거랬어 11111011 에서  11111111 +1 00000000
		
		// 00000101 & 11111011 00000001 = 1
		
		// 4장 조건문 if, switch, for
		// while, break, continue, do-while
		// outer, 향상된 for문
		// 복습문제(if문)
		// if문을 사용하여 다음을 표현하세요.
		// (변수 x를 선언하고,x를 임의로 넣죠 Scanner 사용하면 됩니다.) 
		// 1. x가 5보다 크면 '큽니다' 출력
		// 2. x가 5와 같으면 '같습니다' 출력
		// 3. 그 외는 '작습니다' 출력
		int x = 5;
		
		if(x > 5) {
			
			System.out.println("큽니다.");
			
		
		} else if(x==5) {
			
			System.out.println("같습니다.");
			
		}	else {
			
			System.out.println("작습니다.");
			
		}		// 70점 나는 병신
		
		// switch문을 사용하여 다음을 표현하세요.
		// 1. x가 0이면 '0입니다' 출력
		// 2. x가 1, 2, 3이면 '3 이하입니다' 출력
		// 2-1. 출력문을 한번만 사용할 것
		// 그 외는 '다른 값입니다' 출력
		x = 2;
		switch(x) {
		
		case 0 :
			
			System.out.println("0입니다 병신아");
			break;
			
		case 1 :
		case 2 :
		case 3 :
			System.out.println("3 이하입니다.");
			break;
			
			default :
				System.out.println("다른 값입니다.");
			break;
			
		}
	
		
		// while문을 사용하여 다음을 구현하세요.
		// 1. 10번 반복하며 'while cnt!'를 출력
		// 1-1. cnt는 카운트
		
		int cnt;
		cnt = 0;
		
		while(cnt <10)	{
			
			
			System.out.printf("while %d\n", cnt);
			
			cnt++;
		
			
			
			
		}
		
		
	}

}
