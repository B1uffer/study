package 컬렉션_프레임워크;

import java.util.*;

public class ex1_ArrayList {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// subList(int fromIndex, toIndex) : fromIndex에서 toIndex까지의 지정된 객체를 반환한다. 
		// toIndex가 4라면 4는 반환하지 않고 1~3까지
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		// void sort(Comparator c) : 지정된 정렬기준(c)으로 ArrayList를 정렬한다. list1과 list2는 정렬이 된거임
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		// x.contains(Object o) : 지정된 객체 o가 x에 포함되어 있는지 확인한다. boolean이므로 정상이면 true
		
		list2.add("B");
		list2.add("C");
		print(list2);
		
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		// list1.retainAll(list2) : list1에 대해 저장된 객체 중 list2와 비교해서 공통된 것만 남기고 나머진 싹 지운다
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		System.out.println(list2.size());
		
		
		// list2에서 list1에 포함된 객체들을 삭제한다
		for(int i=list2.size()-1; i>=0; i--) {
			
			if(list1.contains(list2.get(i))) {
				
				list2.remove(i);
				
			}
			
		}
		
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	
	}
	
	static void print(ArrayList list) {
		
		System.out.println("입력한 list 배열 : " + list);
		System.out.println();
		
	}
	
}
