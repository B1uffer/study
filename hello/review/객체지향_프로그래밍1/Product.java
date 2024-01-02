package 객체지향_프로그래밍1;

public class Product {

	static int count = 0;		// 생성된 인스턴스의 수를 저장하기 위한 변수, 클래스
	int serialNo;		// 인스턴스 고유 번호, 인스턴스
	
	{
		++count;
		serialNo = count;
		
	}
	
	public Product() {		// 기본 생성자
		
	}
	
}
