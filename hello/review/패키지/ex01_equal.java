package 패키지;

public class ex01_equal {
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {			// equals(Object obj)는 괄호 안 매개변수의 주소값으로 비교를 한다
			
			System.out.println("v1 = v2");
			
		} else {
			
			System.out.println("v1 != v2");
			
		}
		
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			
			System.out.println("v1 = v2");
			
		} else {
			
			System.out.println("v1 != v2");
			
		}
	}
}
