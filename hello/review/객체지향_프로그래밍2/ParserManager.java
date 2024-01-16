package 객체지향_프로그래밍2;

class ParserManager {
	
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {		// 만약 String 타입의 type가 "XML"이라면
			return new XMLParser();		// XMLParser을 내보낸다
			
		} else {
			Parseable p = new HTMLParser();		// 그 외엔 Parseable 타입의 HTMLParser을 참조하는 p 인스턴스를 생성하고
			return p;		// 내보낸다
			
		}
		
	}
}
