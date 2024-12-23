package 컬렉션_프레임워크;

import java.util.*;

public class ex34_TreeMap_review {

	public static void main(String[] args) {

		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		TreeMap map = new TreeMap();

		for (int i = 0; i < data.length; i++) {

			if (map.containsKey(data[i])) {

				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));

			} else {

				map.put(data[i], new Integer(1));

			}

		}

		Iterator it = map.entrySet().iterator();

		System.out.println("---기본 정렬---");

		while (it.hasNext()) {

			Map.Entry entry = (Map.Entry) it.next();

			int value = ((Integer) entry.getValue()).intValue(); // 이걸 이해하는게 중요함

			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);

		}

		System.out.println();

		Set set = map.entrySet(); // map = new TreeMap();
		List list = new ArrayList(set);		// List

		// static void sort(List list, Comparator c) 에서 가져옴
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		
		System.out.println("값의 크기가 큰 순서대로 정렬");
		
		while(it.hasNext()) {
			
			Map.Entry entry = (Map.Entry)it.next();
			
			int value = ((Integer)entry.getValue()).intValue();
			
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}

	} // main

	public static String printBar(char ch, int value) {

		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {

			bar[i] = ch;

		}

		return new String(bar);

	}

	static class ValueComparator implements Comparator {		// 내부 클래스(inner class)

		public int compare(Object o1, Object o2) {

			if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {

				Map.Entry e1 = (Map.Entry) o1;
				Map.Entry e2 = (Map.Entry) o2;

				int v1 = ((Integer) e1.getValue()).intValue();
				int v2 = ((Integer) e2.getValue()).intValue();

				return v2 - v1;

			}

			return -1;

		}

	}
}
