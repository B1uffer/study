package ch5; // String 배열

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++) {

			System.out.println("names["+i+"] : " + names[i]);
			
		}
		
			String tmp = names[2];		// 배열 names의 세번째 Yi를 tmp에 저장
			System.out.println("tmp : " + tmp);
			names[0] = "Yu";		// names의 첫번째 요소인 Kim을 Yu로 변경
			
			for(String str : names)	{			// for문의 심화형, 향상된 for문
				System.out.println(str);
				
			}
			

	

}		// main의 끝

}
