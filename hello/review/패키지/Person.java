package 패키지;

public class Person {
	
	long id;
	
	public boolean equals(Object obj) {		// obj는 현재 Object 타입. object 클래스의 equals를 오버라이딩 했다
		
		if(obj instanceof Person) {		// obj객체가 Person클래스 타입인지 확인한다
			
			return id == ((Person)obj).id;		
			// * id는 Person클래스이기 떄문에 id값을 참조하기 위해 obj를 Person타입으로 형변환한다
			
		} else {
			
			return false;	// 매개변수에 들어올 obj가 Person타입이 아니라면, 돌려보낸다.
			
		}
		
	}
	
	Person(long id) {
		
		this.id = id;
		
	}
}

/* Object 타입의 equals 메서드
	매개변수로 객체의 참조변수를 받아서(Object obj에서 obj에 받는다) 그 결과를 boolean값으로 알려주는 역할

	public boolean equals(Object obj) {
	
		return (this==obj);
	
	}
	
*/