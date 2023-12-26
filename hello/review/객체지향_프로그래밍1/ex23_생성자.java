package 객체지향_프로그래밍1;

public class ex23_생성자 {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		// Data1에는 Data1()이라는 생성자가 있기 때문에 인스턴스를 생성할 수 있었다
		
		//Data2 d2 = new Data2(); 
		//이건 에러가 발생한다
		// 왜냐하면 Data2에서 Data2()라는 생성자를 찾을 수 없기 때문
		// 따라서 class Data2 내 생성자인 Data2(int x)에 대해서 이미 생성되어 있기 때문에
		// Data2 d2 = new Data2(10);와 같이 int x에 해당하는 수를 넣어주던지,
		// 클래스 Data2에 생성자 Data2()를 따로 추가해주면 된다.
		

	}

}

class Data1 {
	
	int value;
	
	Data1() {		// 매개변수가 없지만 걍 만들어봄
		
	}
	
}

class Data2 {		// 매개변수가 있는 생성자
	
	int value;
	
	Data2(int x) {
		
		value = x;
		
	}
	
	/* Data2() {
	 
	  }
	 */
	
	
}
