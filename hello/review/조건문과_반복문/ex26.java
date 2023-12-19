package 조건문과_반복문;

public class ex26 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) <= 100) {	// 조건식의 (sum += ++i)는 i를 1씩 증가시켜서 sum에 계속 더해나감.
			System.out.printf("%d - %d%n", i, sum);
		}

	}

}
