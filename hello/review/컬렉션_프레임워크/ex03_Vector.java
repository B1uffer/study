package 컬렉션_프레임워크;

import java.util.*;

public class ex03_Vector {

	public static void main(String[] args) {
		
		// Vector의 용량(capacity)과 크기(size)에 관한 예제
		
		Vector v = new Vector(5);		// 용량(capacity)이 5인 Vector 생성
		
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();		// 빈 공간을 없앰
		
		System.out.println("--After trimToSize--");
		
		print(v);
		
		v.ensureCapacity(6);		// Array의 용량이 최소한 6이 되도록 함. 6 이상이라면 아무런 일도 벌어지지 않는다
		System.out.println("--After ensureCapacity(6)");
		print(v);
		
		v.setSize(7);		
		System.out.println("--After setSize(7)--");
		print(v);
		// Vector의 경우 size가 capacity보다 클 경우, 즉 capacity가 부족할 경우 자동적으로 capacity를 2배 증가시킨다.
		
		v.clear();
		System.out.println("--After clear()--");
		print(v);
	}

	public static void print(Vector v) {
		
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
	}
}
