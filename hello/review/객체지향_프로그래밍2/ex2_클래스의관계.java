package 객체지향_프로그래밍2;

public class ex2_클래스의관계 {

	public static void main(String[] args) {
		
		// Point, Triangle, Circle 참조
		
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		/* 
		
		Circle c = new Circle(new Point(150, 150), 50);은 두 문장을 하나로 합친것이다
		Point p = new Point(150, 150);
		Circle c = new Circle(p, 50);
		
		*/
		t.draw();		// 삼각형을 그리기
		c.draw();		// 원을 그리기
	}

}
