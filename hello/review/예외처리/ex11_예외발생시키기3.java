package 예외처리;

public class ex11_예외발생시키기3 {

	public static void main(String[] args) {
		
		throw new RuntimeException();
		// Exception의 자손인 RuntimeException()의 인스턴스를 생성할 때 강제로 예외를 발생시킴
		// 얘는 왜 '컴파일'이 되는가?
		
		// RuntimeException 클래스와 그 자손에 해당하는 예외는 
		// "프로그래머"의 실수에 의해 발생하는 예외들이기 때문에 예외처리를 강제하지 않는 것.
		// 따라서 try - catch문을 통해 RuntimeException()의 자손들에 대한 예외처리를 하지 않아도 컴파일이 된다.
		// 만약 프로그래머의 실수에 의해 발생되는 예외들에게도 예외처리를 한다면 코드가 문어발이 되겠지?
		
		
		
		/* try {
		 * 
		 * 		int[] arr = new int[10];
		 * 
		 * 		System.out.println(arr[0]);
		 * 
		 * 	} catch(ArrayIndexOutOfBoundsException ae {
		 * 		
		 * 
		 * 	  } catch(NullPointerException ne) {
		 * 
		 * 		}
		 */
		
		// 이런 식으로 코드가 개복잡해지는걸 미연에 방지하기 위해 Exception의 자손들에 대한 예외를 강제로 실행했을 땐 컴파일이 되게끔 해놓음
		// 자바 개발자 똑똑하네 생각좀 하네
		
		// 이처럼, 컴파일러가 예외처리를 확인하지 않는 RuntimeException와 같은 클래스 등등은 
		// unchecked예외 라고 부르고, 예외처리를 확인하는 Exception 클래스의 자손들은 checked예외 라고 부른다
	}

}
