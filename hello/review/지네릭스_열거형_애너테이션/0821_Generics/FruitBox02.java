package gene;

import java.util.ArrayList;

public class FruitBox02<T extends Fruit02> extends Box<T> {
	
	// 매개변수 T는 Fruit02, 그 이하의 자손들에 대입할 수 있고 FruitBox02는 Box<T>의 자손이다
	
	class Box<T> {
		
		ArrayList<T> list = new ArrayList<T>();
		
		void add(T item) {
			
			list.add(item);
			
		}
		
		T get (int i) {
			
			return list.get(i);
			
		}
		
		ArrayList<T> getList() {
			
			return list;
			
		}
		
		int size() {
			
			return list.size();
			
		}
		
		public String toString() {
			
			return list.toString();
			
		}
		
	}
	
}
