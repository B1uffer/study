package 컬렉션_프레임워크;

import java.util.*;

public class ex16_Vector_Iterator extends ex04_VectorClass implements Iterator {

	
		// ex04_VectorClass를 상속받는 새로운 클래스가 Iterator를 구현하도록 한 예제
		// Iterator를 어떻게 구현할 것인가????????????????????????????????????
		
		int cursor = 0;
		int lastRet = -1;
		
		public ex16_Vector_Iterator(int capacity) {
			
			super(capacity);
			
		}
		
		public ex16_Vector_Iterator() {
			
			this(10);
			
		}
		
		public String toString() {
			
			String tmp = "";
			Iterator it = iterator();
			
			for(int i=0; it.hasNext(); i++) {
				
				if(i!=0) {
					
					tmp += ", ";
					
				}
				
				tmp += it.next();
				// tmp += next().toString();
				
			}
			
			return "[" + tmp + "]";
			
		}
		
		
		public Iterator iterator() {
			
			// cursor랑 lastRet를 초기화한다
			cursor = 0;
			lastRet = -1;
			
			return this;
			
		}
		
		public boolean hasNext() {
			
			return cursor != size();
			
		}
		
		public Object next() {
			
			Object next = get(cursor);
			lastRet = cursor++;
			// 여기서 lastRet은 cursor에서 1 더한 값만큼 저장된다
			
			return next;
			
		}
		
		public void remove() {
			// p.622의 그림 참고
			
			// 만약 더 이상 삭제할 것이 없다면 예외를 발생시킨다
			if(lastRet == -1) {
				
				throw new IllegalStateException();
				// 만약 next()를 호출하지 않고 remove()를 호출하게 되면 lastRet == -1이 되어 예외가 발생한다
				// remove()는 next()로 읽어온 객체를 삭제하는데 매개변수가 lastRet이기 때문
				
			} else {
				
				remove(lastRet);
				cursor--;		// 삭제 후 cursor의 위치를 1 감소시킴
				lastRet = -1;		// lastRet 초기화
				
				// remove(lastRet)을 호출하고 cursor의 값을 감소시킨 다음 lastRet의 값을 -1로 초기화한다.
				// 그 이유
				// remove()를 호출해서 객체를 삭제하면, 삭제된 위치 이후의 객체들이 빈 공간을 채우기 위해 '자동적으로' 이동하기 때문에
				// cursor의 위치도 '같이' 이동시켜줘야한다
				// 그리고 읽어온 요소가 삭제되었기 때문에 그 위치를 저장한 lastRet은 -1로 초기화 시켜준다.
				// lastRet = -1라는 의미 : 읽어온 값이 없다는 것을 의미함
				// remove()는 반드시 next()와 같이 읽어온 값이 있어야만 호출할 수 있다
				
			}
			
		}
			
		// cursor는 앞으로 읽어 올 요소의 위치를 저장하는 데 사용된다
		// lastRet는 마지막으로 읽어 온 요소의 위치(index)를 저장하는 데 사용된다
		
		
}