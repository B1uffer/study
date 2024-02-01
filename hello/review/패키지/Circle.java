package 패키지;

public class Circle implements Cloneable {
	
	Point2 p;	// 원점
	double r;		// 반지름
	
	Circle(int x, int y, double r) {
		
		this.p.x = x;
		this.p.y = y;
		this.r = r;
		
	}
	
	
	Circle(Point2 p, double r) {
		
		this.p = p;
		this.r = r;
		
	}
	
	public Circle shallowCopy() {
		
		Object obj = null;
		
		try {
			
			obj = super.clone();
			
		} catch(CloneNotSupportedException ce) {
			
			
			
		}
		
		return (Circle)obj;
		
	}
	
	public Circle deepCopy() {
		
		Object obj = null;
		
		try {
			
			obj = super.clone();
			
		} catch(CloneNotSupportedException ce) {
			
			
			
		}
		
		Circle c = (Circle)obj;
		c.p = new Point2(this.p.x, this.p.y);	// 
		
		// 위에 있는 두 줄을 추가하여 shallowCopy()와 차별점을 두었다. Circle 객체를 생성한 것
		// 새로운 객체인 Circle 타입의 c 인스턴스를 생성했는데 이는 새로운 Point2 인스턴스를 참조하게끔 했다
		// 원본이 참조하고 있는 객체 Point2까지 복사한 형태인 것이다......
		
		return c;
		
	}
	
	public String toString() {
		
		
		return "[p = " + p + ", r = " + r + "]";
	}

	
}
