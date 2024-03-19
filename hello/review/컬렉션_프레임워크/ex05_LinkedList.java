package 컬렉션_프레임워크;

import java.util.*;

public class ex05_LinkedList {

	public static void main(String[] args) {
		
		ArrayList ai = new ArrayList(20000);		// ArrayList를 작성할 땐 공간을 여유롭게 잡자
		LinkedList li = new LinkedList();
		
		System.out.println("순차적으로 추가함");
		System.out.println("ArrayList : " + add1(ai));
		System.out.println("LinkedList : " + add1(li));
		System.out.println();
		
		System.out.println("중간에 추가함");
		System.out.println("ArrayList : " + add2(ai));
		System.out.println("LinkedList : " + add2(li));
		System.out.println();
		
		System.out.println("중간에 삭제함");
		System.out.println("ArrayList : " + remove2(ai));
		System.out.println("LinkedList : " + remove2(li));
		System.out.println();
		
		System.out.println("순차적으로 삭제함");
		System.out.println("ArrayList : " + remove1(ai));
		System.out.println("LinkedList : " + remove1(li));
	}

		// System.currentTimeMillis()는 1970년 1월 1일부터 경과한 시간을 long값으로 리턴한다.
		// 1/1000초 값을 리턴한다.(밀리초)
	
	public static long add1(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			
			list.add(i+"");
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
		
	}
	
	public static long add2(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			
			list.add(500, "X");
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
		
	}
	
	public static long remove1(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = list.size()-1; i>=0; i--) {
			
			list.remove(i);
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long remove2(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			
			list.remove(i);
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	
}
