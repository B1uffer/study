package 컬렉션_프레임워크;

import java.util.*;

public class ex21_HashSet2 {

	public static void main(String[] args) {
		
		// HashSet의 성질을 활용한 로또번호 만드는 예제
		
		Set set = new HashSet();
		// HashSet의 특징 : 중복된 값은 저장되지 않는다 (Set 인터페이스의 특징)
		for(int i=0; set.size() < 6; i++) {
			
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
			
		}
		
		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);
		System.out.println(list);
		
		// sort는 배열을 정렬한다
		// 이후 binarySearch()를 사용해서 정렬된 배열에서 값이 저장된 위치(index)를 찾아 반환할 수 있다
		// sort(List list)의 경우 인자로 List 인터페이스 타입을 필요로 하기 때문에
		// LinkedList 클래스의 생성자 LinkedList(Collection c)를 이용해서 HashSet에 저장된 객체들을 LinkedList에 담아서 처리했음
		// List list = new LinkedList(set);		Set set = new HashSet();
	}

}
