package 컬렉션_프레임워크;

import java.util.*;

public class ex17_Vector2 {

	public static void main(String[] args) {
		
		// ㅅㅂ 이거 안됨 아오
		
		ex16_Vector_Iterator v = new ex16_Vector_Iterator();
		
		v.add(0);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		
		System.out.println("삭제 전 : " + v);
		
		Iterator it = v.iterator();
		
		it.next();
		it.remove();
		it.next();
		it.remove();
		System.out.println("삭제 후 : " + v);

	}

}
