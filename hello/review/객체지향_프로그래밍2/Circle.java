package 객체지향_프로그래밍2;

public class Circle extends Shape {		// Shape를 포함함
	
	Point center;		// point 클래스는 x, y좌표를 저장하기 위한 멤버변수를 가지고 있다
	int r;
	
	Circle() {		// 생성자
		this(new Point(0, 0), 100);		// Circle(Point center, int r) 호출
		
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
		
	}
	
	// 그래서 draw에서 사용하는 center.x, center.y를 표현할 수 있는것
	// Point center에서 center는 Point 클래스이기 때문
	void draw() {
		System.out.printf("[center=(%d %d), r = %d, color = %s]%n", center.x, center.y, r, color);
		
	}


}
