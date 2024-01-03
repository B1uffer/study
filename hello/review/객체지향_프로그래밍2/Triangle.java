package 객체지향_프로그래밍2;

public class Triangle extends Shape {		// Shape를 포함함
	
	Point[] p = new Point[3];		// 3개의 point 인스턴스를 담을 배열 생성
	
	Triangle(Point[] p) {
		this.p = p;
		
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", 
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
	
	

}
