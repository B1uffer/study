package 객체지향_프로그래밍2;

class Point2 {

	int x, y;

	Point2(int x, int y) {		// 생성자
		this.x = x;
		this.y = y;

	}
	
	Point2() {		// 이게 있어야만 Point3D에서 컴파일 에러가 나오지 않는다
					// 기본적인 생성자이기 때문에 다른 생성자가 존재하면 컴파일러가 자동적으로 생성해주지 않는다
		
	}

	String getLocation() {
		return "x : " + x + ", y : " + y;

	}
}
