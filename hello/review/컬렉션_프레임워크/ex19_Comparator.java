package 컬렉션_프레임워크;

import java.util.*;

public class ex19_Comparator {

	public static void main(String[] args) {
		
		// 역순으로 정렬해주는 Decending() 메서드는 Decending 클래스를 참조하자
		// 꼭 보자
		
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);		// Arrays.sort이지만 이건 Comparable의 구현에 의한 정렬이다
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);		
		// String.CASE_INSENSITIVE_ORDER는 대소문자를 구별하지 않는다는 String에서 데려온 인스턴스이다
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());		// 역순으로 정렬하게끔 하는 메서드 만들기~
		System.out.println("strArr : " + Arrays.toString(strArr));
	}
	
	/* static void sort(Object[] a)		// 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
	 * static void sort(Object[] a, Comparator c)		// 지정한 Comparator에 의한 정렬
	 * 
	 * Arrays.sort()는 배열을 정렬할 때 
	 * Comparator를 지정해주지 않으면 저장하는 객체(주로 Comparable을 구현한 클래스의 객체)에 구현된 내용에 따라 정렬됨 
		
		String의 Comparable 구현은 문자열이 사전 순으로 정렬되도록 작성되어 있음
		문자열의 오른차순 정렬은 공백, 숫자, 대문자, 소문자 순으로 정렬된다
		명확하게 말하면 문자의 유니코드 순서가 작은 값에서부터 큰 값으로 정렬되는 것임
		
		public static final Comparator CASE_INSENSITIVE_ORDER
			위와 같이 대소문자를 구분하지 않고 비교하는 Comparator CASE_INSENSITIVE_ORDER를 상수의 형태로 제공함
		이를 이용하면 문자열을 대소문자 구분없이 정렬 가능
			Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
	*/
}
