package 객체지향_프로그래밍2;

abstract class unit {
	
	int x, y;
	// 지상유닛과 공중유닛의 이동 방식은 다를것이다
	// 따라서 move를 추상 메서드로 작성하여 각 유닛에 대한 move 구현부를 작성하는 것
	// move가 추상 메서드로 선언된 이상, 앞으로 unit 클래스를 상속받아서 작성되는 클래스들은
	// 모두 move 메서드의 구현부를 해당 클래스의 이동방식에 맞게끔 작성해야만 한다.
	abstract void move(int x, int y);
	void stop() {
		
	}
	
}
