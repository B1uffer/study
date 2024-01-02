package 객체지향_프로그래밍1;

public class Document {

	static int count = 0;
	String name;
	
	Document() {		// 문서 생성시 제목을 정하지 않았을 경우
		this("제목없음" + ++count);
		
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
		
	}
	
}
