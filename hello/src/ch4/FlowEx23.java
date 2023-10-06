package ch4;						// while문 조건식 생략 불가

public class FlowEx23 {

	public static void main(String[] args) {
		
		int i = 5;
		
		while(i--!=0)	{		// i--!=0을 분리하면 i!=0, i-- 두개가 됨, 하지만 둘은 다른 식이다
			
			System.out.println(i + " - I can do it.");
			
		}

	}	// main의 끝

}
