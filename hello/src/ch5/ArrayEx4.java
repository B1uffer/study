package ch5;				// char배열은 for문을 사용하지 않고도 print(), println()으로 배열에 저장된 모든 문자 출력 가능

public class ArrayEx4 {

	public static void main(String[] args) {
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];		// abc와 num을 붙여서 하나의 배열로 만듬
		
		System.out.println(result);
		
		System.arraycopy(abc, 0, result, 0, abc.length);		// System 클래스의 arraycopy()문
		
		// abc의 0번에서 result의 0번으로 abc.length만큼 복사
		
		System.out.println(result);
		
		System.arraycopy(num, 0, result, abc.length, num.length);		// 지정된 범위의 값(배열)들을 한번에 통째로 복사함
		
		// num의 0번에서 result의 abc.length(4)으로 num.length만큼 복사
		
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);		// abc의 0번에서 num의 0번으로 abc.length만큼 복사
		System.out.println(num);		// abc.length만큼 복사되고 num.length의 나머지만큼은 그대로 출력됨
		
		System.arraycopy(abc, 0, num, 6, 3);		// abc의 0번에서 num의 6번으로 3만큼 복사
		System.out.println(num);
		
		
	}		// main 끝

}
