package 컬렉션_프레임워크;

import java.util.*;

public class Descending implements Comparator {

	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Comparable && o2 instanceof Comparable) {		// o1과 o2의 타입이 Comparable이라면
			
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			return c1.compareTo(c2) * -1;		// -1을 곱해서 기본 정렬방식의 역으로 변경함 * 중요
												// c2.compareTo(c1)과 같이 해도 된다
		}
		
		return -1;
		
	}
	
	/*
	 * String의 기본 정렬을 반대로 하는것; 문자열을 내림차순(descending order)을 구현하는 것
	 * 매우 간단
	 * String에 구현된 compareTo()의 결과에 -1을 곱하기만 하면 됨
	 * 또는 비교하는 객체의 위치를 바꿔서 c1.compareTo(c2) * -1이라면 c2.compareTo(c1)으로 바꿔주기만 하면 된다
	 * 다만, compare()의 매개변수가 Object 타입이기 떄문에 compareTo()를 바로 호출할 순 없고 형변환을 해줘야 한다
	 * 
	 * Comparable c1 = (Comparable)o1;
	 * Comparable c2 = (Comparable)o2;
	 * 
	 * return c1.compareTo(c2) * -1;
	 */
	
}
