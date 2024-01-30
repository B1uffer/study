package 패키지;

public class Point implements Cloneable {		// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있음
	
	int X, Y;		// 좌표
	
	Point() {
		
		
		
	}
	
	Point(int x, int y) {
		
		this.X = x;
		this.Y = y;
		
	}
	
	public String toString() {
		
		return "x = " + X + ", y = " + Y;
		
	}
	
	public Object clone() {
		
		Object obj = null;
		
		try {
			
			obj = super.clone();		// clone()은 반드시 예외처리를 해주어야만 한다.
			
		} catch(CloneNotSupportedException ce) {		// CloneNotSupportedException이 clone()에 대한 예외
			
			
			
		}
		
		return obj;
	}
}
