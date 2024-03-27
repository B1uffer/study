package 컬렉션_프레임워크;

import java.util.*;

public class ex26_TreeSet {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		for(int i=0; set.size() < 6; i++) {		// set.size()는 배열 공간
			
			int num = (int)(Math.random()*45) + 1;
			set.add(num);		// set.add(new Integer(num));
			
		}
		
		System.out.println("TreeSet() : " + set);
		
		// HashSet()때와는 다르게 TreeSet()은 정렬하는 코드가 빠져있는데,
		// 이는 TreeSet()은 저장할 때 이미 정렬하기 때문에 읽어올 때 정렬할 필요가 없기 때문

	}

}
