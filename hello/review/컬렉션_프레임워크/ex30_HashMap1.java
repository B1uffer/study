package 컬렉션_프레임워크;

import java.util.*;

public class ex30_HashMap1 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();		// HashMap 생성
		
		map.put("myID", "1234");		// HashMap()타입의 map인스턴스에 사용자ID, 비밀번호를 key, value로 저장한다
		map.put("B1uffer", "1234");
		map.put("asdf", "1234444");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("ID와 PASSWORD를 입력해주세요.");
			System.out.print("ID : ");
			String id = s.nextLine().trim();  // trim() 문자열 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다
			
			System.out.print("PW : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {		// containsKey(Object key) : hashMap에 입력한 key에 해당하는 값이 있는지 알려준다 있으면 true
				// 없으면
				
				System.out.println("입력하신 ID는 존재하지 않습니다." + "다시 입력해주세요.");
				
			} else {
				
				System.out.println("로그인 되었습니다!");
				break;
				
			}
			
		}

	}

}
