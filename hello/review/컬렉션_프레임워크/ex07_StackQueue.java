package 컬렉션_프레임워크;

import java.util.*;

public class ex07_StackQueue {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();		// Queue는 인터페이스 구현체인 LinkedList 사용
		
		st.push("0");		// Stack에 객체(item)를 저장한다
		st.push("1");
		st.push("2");
		
		q.offer("0");		// Queue에 객체(item)를 저장한다
		q.offer("1");
		q.offer("2");
		
		System.out.println("stack --");
		
		while(!st.empty()) {
			
			System.out.println(st.pop());		// stack에 저장된 객체를 꺼낸다
			//Stack은 먼저 넣은 것이 나중에 나오는 구조이다 
			
		}
		
		System.out.println("queue --");
		
		while(!q.isEmpty()) {
			
			System.out.println(q.poll());		// queue에서 객체를 꺼내 반환한다
			//Queue는 먼저 넣은 것이 먼저 나오는 구조이다
			
		}

	}

}
