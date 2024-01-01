package 객체지향_프로그래밍1;

class 변수의초기화 {

	int x;		// 인스턴스 변수
	int y = x;		// 인스턴스 변수

	void method1() {
		int i;		// 지역변수
		i = 0; // 변수의 초기화
		
		int j = i;	// 지역변수를 초기화하지 않고 사용하면 에러뜸
		
	}
}
