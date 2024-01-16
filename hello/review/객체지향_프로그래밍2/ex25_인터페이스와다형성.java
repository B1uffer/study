package 객체지향_프로그래밍2;

public class ex25_인터페이스와다형성 {

	public static void main(String[] args) {
		
		Parseable parser = ParserManager.getParser("XML");
		// Parseable 타입의 parser에서 Parseable이 인터페이스이다
		parser.parse("document.xml"); 
		
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");

	}

}
