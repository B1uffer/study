package 배열;

public class ex15_문자열을_모스부호로 {

	public static void main(String[] args) {
		
		String source = "SOSHELP";
		
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
				".--", ".--", "-..-", "-.--", "--.."
		};
		
		String result = " ";
		
		for(int i=0; i<source.length(); i++) {
			
			result+=morse[source.charAt(i)-'A'];	// morse[]의 [] 안에 함수를 참고
		
		}
		
		System.out.println("source : " + source);
		System.out.println("morse : " + result);

	}

}
