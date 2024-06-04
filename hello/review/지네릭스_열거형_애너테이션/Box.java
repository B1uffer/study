package 지네릭스_열거형_애너테이션;

import java.util.ArrayList;

public class Box<T> {

	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		
		list.add(item);
		

	}
	
	T get(int i) {		// T 타입의 메서드 get
		
		return list.get(i);
		
	}
	
	int size() {
		
		return list.size();
		
	}
	
	public String toString() {
		
		return list.toString();
		
	}
	
	
	
	
	
	
	
	
	
	/*T item;
	
	void setItem(T item) {
		
		this.item = item;
		
	}
	
	T getItem() {
		
		return item;
		
	}
	*/
	
	/*
	 *	class Box {
	 *
	 *		String item;
	 *
	 *		void setItem(String item) {
	 *
	 *			this.item = item;
	 *
	 *		}
	 * 	
	 * 		String getItem() {
	 * 
	 * 			return item;
	 * 
	 * 		}
	 */
}
