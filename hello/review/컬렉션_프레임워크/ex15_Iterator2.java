package 컬렉션_프레임워크;

import java.util.*;

public class ex15_Iterator2 {

	public static void main(String[] args) {
		
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10; i++) {
			
			original.add(i+"");
			
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			
			copy1.add(it.next());
			
		}
		
		System.out.println("위 코드로 인해 original에서 copy1로 복사함");
		System.out.println("original : " + original);
		System.out.println("copy1 : " + copy1);
		System.out.println("copy2 : " + copy2);
		System.out.println();
		
		// Iterator는 재사용할 수 없으므로 다시 얻어와야한다.
		it = original.iterator();
		
		while(it.hasNext()) {
			
			copy2.add(it.next());
			
		}
		
		System.out.println("위 코드로 original에서 copy2로 복사함");
		System.out.println("original : " + original);
		System.out.println("copy2 : " + copy2);
		System.out.println("copy1 : " + copy1);
		
		System.out.println("주의! Iterator를 같은 인스턴스로 재사용하고 싶다면 새로운 Iterator타입의 iterator()인스턴스를 얻어와야한다.");
	}

}
