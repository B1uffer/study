package 객체지향_프로그래밍2;

public class CaptionTv extends Tv {		// Tv를 상속한 자클래스
	
	boolean caption;		// 캡션상태
	
	void displayCaption(String text) {
		if(caption) {		// caption이 참이라면(on 상태라면)
			System.out.println(text);		// 텍스트를 보여줌
			
		}
		
	}
	

}
