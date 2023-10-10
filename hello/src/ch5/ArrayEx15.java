package ch5;						// 모스부호 나타내기

public class ArrayEx15 {

	public static void main(String[] args) {
		
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.."};
		
	
	String result = "";
	
	for(int i=0; i < source.length(); i++)	{		// i는 0부터 6까지
	
		result+=morse[source.charAt(i) - 'A'];		// source.charAt(i) - 'A'의 값들을 morse에서 찾아오기
		
	}
	
	System.out.println("source : " + source);
	System.out.println("morse : " + result);

	}		// main의 끝

}
