package 패키지;

import java.util.regex.*;

public class ex32_정규식2 {

	public static void main(String[] args) {

		// 자주 쓰이는 정규식에 대한 패턴들
		String[] data = { "bat", "baby", "bonus", 
				"c", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count",
				"date", "disc" };

		String[] pattern = { ".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w",
				"c\\d", "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}" };

		for (int x = 0; x < pattern.length; x++) {

			Pattern p = Pattern.compile(pattern[x]);
			// 1. 정규식을 매개변수로 Pattern 클래스의 static 메서드인 Pattern.compile(String regex)를 호출하여
			// Pattern 인스턴스를 얻음
			// 위에 보이지만 pattern[x]는 String 타입이다

			System.out.print("Pattern " + pattern[x] + "  결과 : ");
			// pattern[0]부터 pattern[pattern.length]까지
			// println이 아닌 print다. if문의 print와 함께 이어지게 하게끔

			for (int i = 0; i < data.length; i++) {

				Matcher m = p.matcher(data[i]);
				// 2. 정규식으로 비교할 대상을 매개변수로 Pattern 클래스의 Matcher matchar(CharSequence input)을 호출해서 Matcher 인스턴스를 얻음. 
				// 이 때 import java.util.regex.*; 잊지 말것
				// 이 경우 비교할 대상이 String[] 타입의 data이니까 Pattern.compile(pattern[x])와 data를 서로 비교하는것
				// 뭔소리냐면 pattern[1]과 data[1]을 서로 비교한다고 할 때, pattern[1] 안에 들어있는게 c[a-z]*니까 
				// c 다음에 a~z가 오고 그 이후엔 뭐가 오든 상관없다는 패턴이다. 이걸 두번째 for문을 통해 data[data.legnth]까지 살펴보고
				// 있는건 아래 if문에다가 출력한다는 소리임

				if (m.matches()) {
					// 3. Matcher 인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인함.
					// 실제로 matches()는 boolean 타입이다 한번 해보셈
					System.out.print(data[i] + ",");

				}
				
			}
			System.out.println();
			// 여기에서 for x = 0가 끝나고 첫번째 for문 x = 1로 간다. 이걸 x = pattern.length-1까지 하는것
		}

	}
}
