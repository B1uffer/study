package 컬렉션_프레임워크;

import java.util.*;

public class ex02_ArrayList {

	public static void main(String[] args) {
		
		// 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하는 예제
		
		final int LIMIT = 10;		// 자르고자 하는 글자의 개수 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);
		
		for(int i=0; i< length; i+=LIMIT) {		// i는 0부터 source.length()까지, i를 LIMIT만큼 더한다
			
			if(i + LIMIT < length) {		// i와 LIMIT를 더한 값이 length값보다 작다면
				
				list.add(source.substring(i, i+LIMIT));		// list는 source의 i부터 i+LIMIT까지의 값을 얻는다
				
			} else {	//그 외엔
				
				list.add(source.substring(i));		// list에 source의 i까지의 값을 저장한다
				
			}
				
		}
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}

	}

}
