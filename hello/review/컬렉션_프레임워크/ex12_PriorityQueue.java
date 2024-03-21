package 컬렉션_프레임워크;

import java.util.*;

public class ex12_PriorityQueue {

	public static void main(String[] args) {
		
		Queue qp = new PriorityQueue();		// LinkedList()와 다르게 PriorityQueue는 메서드가 있다
		
		qp.offer(3);		// qp.offer(new Integer(3)); 오토박싱
		qp.offer(new Integer(1));
		System.out.println(qp);
		qp.offer(5);
		qp.offer(2);
		qp.offer(4);
		System.out.println(qp);
		// PriorityQueue()는 우선순위가 높은 것부터 꺼낼 수 있게 만들어져있음
		
		Object obj = null;
		
		while((obj = qp.poll()) != null) {		// PriorityQueue는 null값을 가질 수 없으므로 (obj = qp.poll()) = null을 하면 조짐
			// poll()은 Queue에서 객체를 꺼내서 반환한다. obj에게 가는것
			
			System.out.println(obj);
			
		}
		
	}

}
