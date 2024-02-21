package 패키지;

import java.util.*;

public class ex41_StringTokenizer4 {

	public static void main(String[] args) {
		
		// 한글로 된 숫자를 아라비아 숫자로 변환하는 예제임
		// 좀 어렵다. 공부해야함
		
		String input = "삼십만삼천백십오";
		System.out.println(input);
		System.out.println(hangulToNum(input));

	}

	
	public static long hangulToNum(String input) {		// 한글을 숫자로 바꾸는 메서드임
		
		long result = 0;		// 최종 변환결과를 저장하기 위한 변수
		long tmpResult = 0;		// "만, 억, 조" 등 단위가 나오기 전까지 십백천 단위의 값을 저장하기 위한 임시변수임
		long num = 0;
		
		final String NUMBER = "영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조경";
		final long[] UNIT_NUM = {10, 100, 1000, 10000, (long)1e8, (long)1e12, (long)1e16};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()) {
			
			String token = st.nextToken();
			int check = NUMBER.indexOf(token);
			// NUMBER.indexOf(token)은 주어진 문자 token이 NUMBER의 문자열에 존재하는지 확인해서 위치를 알려준다.
			// 못찾으면 -1을 반환함.
			// token의 경우 st.nextToken()이고 st는 StringTokenizer타입의 input을 참조한다.
			// while이 첫 순환일때, NUMBER = "영일이삼사오육칠팔구"에서 "삼"이 NUMBER에 있다면 그 위치를 반환해준다.(0)
			
			if(check == -1) {		// NUMBER에서 찾지 못했을 경우, 즉 십백천만억조경인 단위의 경우,
				
				if("만억조경".indexOf(token) == -1) {	// 만억조경이 아닌 경우,
					
					tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];		// 뭔소린지 모르겠네
					
				} else {		// 그 외엔, 즉 천 이하 단위의 숫자를 다루는 것 같음
					
					tmpResult += num;		// 단위에 num을 더해서 저장함
					result += (tmpResult!=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];	// 얘도 모르겠네
					
					tmpResult = 0; // 다시 0으로 초기화
				}
				
				num = 0;		// num도 0으로 초기화함
				
				
			} else { // check !== -1, 즉 문자가 단위가 아닌 숫자일 경우
				
				num = check;	// 그 숫자를 저장한다
				
			}
			
		}
		
		return result + tmpResult + num;
		
	}
	
}
