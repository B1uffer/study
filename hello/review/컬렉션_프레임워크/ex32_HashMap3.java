package 컬렉션_프레임워크;

import java.util.*;

public class ex32_HashMap3 {

	static HashMap phoneBook = new HashMap();
	
	// HashMap은 데이터와 키, 값을 모두 Object값으로 저장하기 때문에 HashMap의 값(value)으로 HashMap을 다시 저장할 수 있음
	
	// 존나 이해가 안되니 순서
	
	// 1. 먼저 전화번호를 만들 그룹을 만든다 (phoneBook = new HashMap())
	// 2. 그룹 안에 다시 이름과 전화번호를 저장하도록 한다
	// 		이 때, 이름대신 전화번호를 키로 사용했다. value는 name  ..... addPhoneNo 참조
	// 
	
	public static void main(String[] args) {
		
		addPhoneNo("친구", "김병신", "010-1111-2222");
		addPhoneNo("병신", "블러퍼", "010-1111-1112");
		addPhoneNo("병신", "어둠의블러퍼", "010-1111-1113");
		addPhoneNo("병신", "빛의블러퍼", "010-1111-1112");
		addPhoneNo("병신", "물의블러퍼", "010-1111-1112");
		addPhoneNo("귀빈", "상병신", "010-1111-3333");
		
		
		printList();

	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		
		group.put(tel, name);		// 전화번호를 key로 저장한다	(put(key, value))
		
	}
	
	static void addGroup(String groupName) {		// 그룹을 추가하는 메서드
		
		if(!phoneBook.containsKey(groupName)) {		// phoneBook의 key에 입력한 groupName이 없다면
			
			phoneBook.put(groupName, new HashMap());		// phoneBook에 해당 groupName과 새로운 HashMap인스턴스를 추가한다
			
		}
		
	}
	
	static void addPhoneNo(String name, String tel) {
		
		addPhoneNo("기타", name, tel);
		
	}
	
	static void printList() {
		
		Set set = phoneBook.entrySet();		// Map 인터페이스에 있는 메서드, Set entrySet()
		// Map 인터페이스는 key, value를 가지고 있다, 이를 하나의 쌍으로 묶어서 출력하는 인터페이스
		// Set entrySet()은 Map에 저장되어있는 key - Value 한 쌍을 Map.Entry 타입의 객체로 저장한 Set으로 반환함
		// Map.Entry 인터페이스는 Map의 내부 인터페이스임 ex31 참조
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();		// 이걸 set으로 반환하겠대
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				
				Map.Entry subE = (Map.Entry)subIt.next();
				
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}
			
			System.out.println();
			
		}
		
	}
	
}
