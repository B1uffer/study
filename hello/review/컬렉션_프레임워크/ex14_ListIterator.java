package 컬렉션_프레임워크;

import java.util.*;

public class ex14_ListIterator {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next());
			// next()를 사용하기 전에 반드시 hasNext()를 호출해서 이동할 수 있는지의 여부를 확인해야한다
		}
		
		System.out.println();
		
		while(it.hasPrevious()) {
			
			System.out.print(it.previous());
			// previous()를 사용하기 전에 반드시 hasPrevious()를 호출해서 이동할 수 있는지의 여부를 확인해야함
		}
	
	}

}
