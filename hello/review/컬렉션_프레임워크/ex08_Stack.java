package 컬렉션_프레임워크;

import java.util.*;

public class ex08_Stack extends Vector {		// Stack은 Vector로부터 상속받았다

	public Object push(Object item) {		// Stack에 객체를 저장하는 메서드
		
		addElement(item);
		
		return item;
		
	}
	
	public Object pop() {		// Stack의 맨 위에 저장된 객체를 "꺼내는" 메서드
		
		Object obj = peek();		// peek()은 맨 위에 저장된 객체를 반환하는 메서드
		
		removeElementAt(size() - 1);		// 마지막 요소를 삭제한다
		
		return obj;
		
	}
	
	public Object peek() {		// Stack의 맨 위에 저장된 객체를 "반환하는" 메서드
		
		int len = size();
		
		if(len == 0) {
			
			throw new EmptyStackException();
			// 여기에서 EmptyStackException을 발생시킨다
		}
		
		return elementAt(len - 1);		// 마지막 요소를 반환하는데, 배열의 index는 0부터 시작하므로 -1을 해줌
		
	}
	
	public boolean empty() {		// stack이 비어있는지의 여부를 알려주는 메서드
		
		return size() == 0;		// 비어있으면 true
		
	}
	
	public int search(Object o) {
		
		int i = lastIndexOf(o);		// o와 관련된 객체를 끝에서부터 찾는다
		
		if(i>=0) {		// 만약 객체를 찾았다면,
			
			return size() - 1;		// Stack은 맨 위에 저장된 객체의 index를 1로 정의하기 떄문에 Size() - 1 을 반환한다
			
		}
		
		return -1;		// 못찾으면 -1을 반환한다
		
	}

}
