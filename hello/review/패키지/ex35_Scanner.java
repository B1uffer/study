package 패키지;

import java.util.*;

public class ex35_Scanner {

	public static void main(String[] args) {
		
		// 화면으로부터 라인단위로 입력받아서 입력받은 내용에 대해 공백을 구분자로 나눠서 출력하는 예제
		// 입력받은 라인의 단어는 공백이 여러 개 일 수 있으므로 정규식을 " +"로 했다
		
		
		// 이 예제를 발전시켜서 도스같은 콘솔 어플리케이션을 한번 작성해보자!
		
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = s.nextLine();
			// 화면으로부터 라인단위로 입력받음
			
			
			
			input = input.trim();
			// 입력받은 값에서 불필요한 앞, 뒤 공백을 제거한다
			argArr = input.split(" +");
			//입력받은 내용의 공백을 구분자로 자른다. 얘 정규식임. " +"는 하나 이상의 공백을 의미함
			String command = argArr[0].trim();
			// 얘도 마찬가지로 앞 뒤 공백을 자른다
			
			// 이거 모르겠네
			
			
			if("".equals(input)) {
				
				continue;
				
			}
			
			input = input.toLowerCase();
			// 명령어를 소문자로 바꿈
			
			if(input.equals("q")) {
				// command에 q만 입력하면
				
				System.exit(0);
				// 시스템 종료됨
				
			} else {		// 그 외엔
				
				for(int i=0; i < argArr.length; i++) {
					
					System.out.println(argArr[i]);
					// 프린트한다
				}
				
			}
		}

	}

}
