package 객체지향_프로그래밍2;

class Point3D extends Point2 {
	
	int z;

	Point3D(int x, int y, int z) {
		super();		// Point2() { } 가 생성되어있지 않으면 컴파일 에러가 나온다
		// super(x, y); 로도 super();을 대신할 수 있다. 호출했기 때문
		this.x = x;
		this.y = y;
		this.z = z;
		
		

	}

	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
