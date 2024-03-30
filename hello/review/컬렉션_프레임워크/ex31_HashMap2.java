package 컬렉션_프레임워크;

import java.util.*;

public class ex31_HashMap2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("블러퍼", new Integer(100));
		map.put("갑판장", new Integer(90));
		map.put("이케이", new Integer(80));
		map.put("루나시", new Integer(95));
		map.put("어둠의블러퍼", new Integer(100));
		
		Set set = map.entrySet();		// Set으로 형변환하는 느낌으로
		// Set entrySet() : HashMap에 저장된 키와 값을 한데 묶어서 엔트리의 형태로 Set에 저장한다
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry e = (Map.Entry)it.next();		// Map 인터페이스 참조
			/*
			 * Map.Entry 인터페이스
			 * Map 인터페이스의 내부 인터페이스임
			 * 내부클래스와 같이, 인터페이스도 인터페이스 안에 인터페이스를 정의하는 내부 인터페이스를 사용할 수 있다
			 * Map에 저장되는 key - value쌍을 다루기 위해 내부적으로 Entry 인터페이스를 정의했다
			 * 이는 보다 객체지향적으로 설계하기 위함
			 * 
			 * Map 인터페이스를 구현하는 클래스에서는 Map.Entry 인터페이스도 함께 구현해야한다
			 * 
			 * 	public interface Map {
			 * 		Object getKey();
			 * 		Object getValue();
			 * 		Object setValue(Object value);
			 * 		boolean equals(Object o);
			 * 		int hashCode();
			 *		// 생략
			 */
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
			
		}
		
		System.out.println();
		
		set = map.keySet();		// Map 인터페이스 참조, Map에 저장된 모든 key객체를 반환함
		System.out.print("참가자 : " + set);
		System.out.println();
		
		Collection key = map.keySet();
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			
			Integer i = (Integer)it.next();
			total += i.intValue(); 
			
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ((float)total/set.size()));
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		
	}

}
