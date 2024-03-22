package 컬렉션_프레임워크;

import java.util.*;

public class ex20_HashSet {

	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();		// HashSet은 Set 인터페이스를 구현했다
		
		System.out.println(Arrays.toString(objArr));
		System.out.println(set);
		
		for(int i=0; i<objArr.length; i++) {
			
			set.add(objArr[i]);
			
		}
		
		System.out.println(set);
		// "1"이라는 String과 new Integer(1)이라는 Integer은 타입이 다르기 때문에 합집합에서 걸러지지 않았음
		// 따라서 1, 1, 2, 3, 4가 나옴
		
	}

}
