package 패키지;

import java.util.*;

public class ex27_Random_Class {

	public static void main(String[] args) {
		
		Random rand = new Random(1);		// 매개변수 1을 종자값으로 하는 Random 인스턴스
		Random rand2 = new Random(1);
		
		System.out.println("= rand =");
		for(int i = 0; i < 5; i++) {
			
			System.out.println(i + ":" + rand.nextInt());
			
		}
		
		System.out.println();
		
		System.out.println("= rand2 = ");
		for(int i = 0; i < 5; i++) {
			
			System.out.println(i + ":" + rand2.nextInt());
			// Random인스턴스인 rand와 rand2가 같은 종자값을 매개변수로 사용하기 때문에 같은 값을 순서대로 얻는다.
			// 같은 종자값을 갖는 Random 인스턴스는 시스템이나 실행기간 등에 관계 없이, 항상 같은 값을 같은 순서로 반환할 것을 보장한다.
		}

	}

}
