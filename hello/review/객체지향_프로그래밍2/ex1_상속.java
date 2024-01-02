package 객체지향_프로그래밍2;

public class ex1_상속 {

	public static void main(String[] args) {
		
		// CaptionTv를 참조
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;		// Tv로부터 상속받은 멤버
		ctv.channelUp();		// 마찬가지로 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World!");
		ctv.caption = true;
		ctv.displayCaption("Hello,World?");

	}

}
