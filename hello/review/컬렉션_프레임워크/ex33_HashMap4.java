package 컬렉션_프레임워크;

import java.util.*;

public class ex33_HashMap4 {

	public static void main(String[] args) {

		// 한정된 값을 구할 땐 배열이 좋음
		// 한정되지 않은 범위의 문자열 배열에 대한 빈도수는 HashMap이 더 좋을 수 있다
		
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();		// HashMap 생성

		for (int i = 0; i < data.length; i++) {

			if (map.containsKey(data[i])) {
				// map.containsKey(data[i])는 data[i]를 통해 배열의 요소를 하나하나 보면서
				// HashMap에 key가 포함되어있는지 확인함
				// 여기서 true이면 아래의 코드로 간다

				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1)); // new Integer을 생략해도 된다

			} else {		// 위 문자열을 읽는 containsKey에서 false라면 아래의 코드를 실행한다

				map.put(data[i], new Integer(1));		// HashMap 타입의 map 인스턴스에 data[i]를 키로 저장하고 거기에 1을 저장함
				
			}

		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}
		
	}		// main

	
	public static String printBar(char ch, int value) {		// 결과를 나타내주는 메서드
		//문자열 배열에 담긴 문자열들의 빈도수를 구할 수 있음
		
		char[] bar = new char[value];		// char형
		
		for(int i=0; i < bar.length; i++) {
			
			bar[i] = ch;
			
		}
		
		return new String(bar);
		
	}
}
