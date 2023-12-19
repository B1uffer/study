package 조건문과_반복문;

public class ex19_삼중for문 {

	public static void main(String[] args) {
		
		for(int i=1; i <= 3; i++) {
			for (int j=1; j<=3; j++) {
				for(int k=1; k<=3; k++) {
	// string + int + int + int = string + int + int = string + int = string
					System.out.println(" " + i + j + k);
				}
			}
		}

	}

}
