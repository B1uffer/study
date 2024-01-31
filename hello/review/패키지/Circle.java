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
		
		return c;
		
	}
	
	public String toString() {
		
		
		return "[p = " + p + ", r = " + r + "]";
	}

	
}
