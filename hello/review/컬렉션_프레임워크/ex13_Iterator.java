package 컬렉션_프레임워크;

import java.util.*;

public class ex13_Iterator {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			Object obj = it.next();
			System.out.println(obj);
			
		}
		
	}

}
