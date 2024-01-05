package 객체지향_프로그래밍2;

public class Point3D2 extends Point3 {
	// Point3 참조
	
	int z = 30;
	
	Point3D2() {
		
		this(100, 200, 300); // Point3D2(int x, int y, int z) 호출
	}
	
	Point3D2(int x, int y, int z) {
		super(x, y);	// Point3(int x, int y) 호출
		
		this.z = z;
	}
}
