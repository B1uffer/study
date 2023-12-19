package 조건문과_반복문;

public class ex30_break문 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break;	// break가 실행되면 while문을 완전히 벗어난다.
			}

			++i;
			sum += i;
			System.out.print(i);
			
		}
		System.out.println();
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		

	}

}
