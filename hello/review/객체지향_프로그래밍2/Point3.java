package 객체지향_프로그래밍2;

public class Point3 {
	
	int x = 10;
	int y = 20;
	
	Point3(int x, int y) {
		super();		// 포함하는 부모가 없기 때문에 이를 입력하면 조상클래스인 Object()가 온다
		
		this.x = x;
		this.y = y;
		
	}
	
	Point3() {
		
	}
}
