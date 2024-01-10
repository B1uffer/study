package 객체지향_프로그래밍2;

public class ex17_instanceof {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance.");
			
			
		}
		
		if(fe instanceof Car) {
			System.out.println("this is a Car instance.");
			
		}
		
		if(fe instanceof Object) {
			System.out.println("this is an Object instance.");
			
		}
		
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력함

	}

}
