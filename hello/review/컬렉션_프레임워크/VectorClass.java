package 컬렉션_프레임워크;

import java.util.*;

public class VectorClass implements List {

		// Vector 클래스의 실제 코드를 재구성한 것
		
		Object[] data = null;		// 객체를 담기 위한 배열 선언
		int capacity = 0;			// 용량
		int size = 0;				// 크기
		
		public VectorClass(int capacity) {
			
			if(capacity <0) {
				
				throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
				
			}
			
		}
		
		public VectorClass() {
			
				this(10);	// 크기를 지정하지 않으면 자동적으로 크기를 10으로 설정함
			
		}
		
		public void ensureCapacity(int minCapacity) {		// 최소한의 저장공간(Capacity)을 확보하는 메서드
			
			if(minCapacity - data.length > 0) {		// 매개변수 - data의 길이가 0보다 크다면
				
				setCapacity(minCapacity);
				
			}
			
		}
		
		public boolean add(Object obj) {
			
			ensureCapacity(size+1);
			// 새로운 객체를 저장하기 전, 저장할 공간을 확보함
			
			data[size++] = obj;		// data[size++] 값에 obj를 넣음
			return true;
			
		}
		
		public Object get(int index) {
			// 지정된 위치의 값을 반환한다
			
			if(index < 0 || index >= size) {		// index의 값이 0보다 작거나 size보다 크거나 같다면
				// 배열은 0부터 n-1까지니까 크거나 같으면 안됨
				
				throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
				
			}
			
			return data[index];
			
		}
		
		public Object remove(int index) {		// 제거함
			
			// 지정된 위치(index)에 있는 객체를 삭제하고 삭제한 객체를 반환하도록 작성됨
			
			Object oldObj = null;
			
			if(index < 0 || index >= size) {
				
				throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
				
			}
			
			oldObj = data[index];
			
			if(index != size-1) { // index의 값이 size-1이 아니라면,
				
				System.arraycopy(data, index+1, data, index, size-index-1);
				// System.arraycopy로 byte[]형태의 데이터를 자르거나 연접한다
				// System.arraycopy(src, srcPos, dest, destPos, length)
				// Object src : 복사하는 소스, 원본
				// int srcPos : 원본 소스에서 어느 부분부터 읽어올지 위치를 정함, 처음부터 읽을거면 0을 넣어줌
				// Object dest : 복사할 소스, 복사할 대상
				// int destPos : 복사본에서 자료를 받을 때 어느 부분부터 쓸 것인지 시작 위치를 정해줌
				// int length : 원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이, 원본에서 복사본까지 얼마나 읽어 올지 입력하는 것
				// 자세한건 p.594 참고
			}
			
			data[size-1] = null;		// 데이터의 마지막을 null로 함. 배열은 0부터 시작하기 때문에 size-1
			size--;
			
			return oldObj;
			
		}
		
		public boolean remove(Object obj) {
			
			for(int i=0; i<size; i++) {
				
				if(obj.equals(data[i])) {
					
					remove(i);
					return true;
					
				}
				
			}
			
			return false;
			
		}
		
		public void trimToSize() {
			
			setCapacity(size);
			
		}
		
		public void setCapacity(int capacity) {
			
			if(this.capacity == capacity) {		// 크기가 같다면 걍 냅둔다
				
				return;
				
			}
			
			Object[] tmp = new Object[capacity];
			System.arraycopy(data, 0, tmp, 0, size);
			data = tmp;
			this.capacity = capacity;
			
		}
		
		public void clear() {
			
			
			for(int i=0; i < size; i++) {
				
				data[i] = null;
				
			}
			
			size = 0;
			
		}
		
		public Object[] toArray() {
			
			Object[] result = new Object[size];
			System.arraycopy(data, 0, result, 0, size);
			
			return result;
			
		}
		
		public boolean isEmpty() {
			
			return size == 0;
			
		}
		
		public int capacity() {
			
			return capacity;
			
		}
		
		public int size() {
			
			return size;
			
		}
		
		// 이제부터가 List 인터페이스로부터 상속받은 메서드들임 시발
		//
		//
		//

		
		// public int size();
		// public boolean isEmpty();
		public boolean contains(Object o) {
			
			return false;
			
		}
		
		public Iterator iterator() {
			
			return null;
			
		}
		
		// public Object[] toArray();

		public Object[] toArray(Object a[]) {
			
			return null;
			
		}
		
		// public boolean add(Object o);
		// public boolean remove(Object o);
		
		public boolean containsAll(Collection c) {
			
			return false;
			
		}
		
		public boolean addAll(Collection c) {
			
			return false;
			
		}
		
		public boolean addAll(int index, Collection c) {
			
			return false;
			
		}
		
		public boolean removeAll(Collection c) {
			
			return false;
			
		}
		
		public boolean retainAll(Collection c) {
			
			return false;
			
		}
		
		// public void clear();
		
		public boolean equals(Object o) {
			
			return false;
			
		}
		
		// public int hashCode();
		// public Object get(int index);
		
		public Object set(int index, Object element) {
			
			return null;
			
		}
		
		public void add(int index, Object element) {
			
			
			
		}
		
		// public Object remove(int index);
		
		public int indexOf(Object o) {
			
			return -1;
			
		}
		
		public int lastIndexOf(Object o) {
			
			return -1;
			
		}
		
		public ListIterator listIterator() {
			
			return null;
			
		}
		
		public ListIterator listIterator(int index) {
			
			return null;
			
		}
		
		public List subList(int fromIndex, int toIndex) {
			
			return null;
			
		}
		
		/*
		
		default void sort(Comparator c) {
			
			
			
		}
		
		default Spliterator spliterator() {
			
			
			
		}
		
		default void raplaceAll(UnaryOperator operator) {
			
			
			
		}
		 */
	}

