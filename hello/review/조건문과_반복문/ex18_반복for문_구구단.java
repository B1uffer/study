package 조건문과_반복문;

public class ex18_반복for문_구구단 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
			
		}

	}

}
