package 객체지향_프로그래밍2;

public class Point {

	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	Point() {
		this(0, 0);
		
	}
	
	String getXY() {
		return("("+ x +", "+ y +")");		// x와 y의 값을 문자열로 반환한다
		
	}

}
