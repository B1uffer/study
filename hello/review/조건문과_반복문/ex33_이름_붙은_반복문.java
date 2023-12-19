package 조건문과_반복문;

public class ex33_이름_붙은_반복문 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i <= 9; i++) {
					for(int j=1; j<=9; j++) {
						if(j==5) {
							break Loop1;
							//break;	// 2단부터 9단까지 4줄이 출력된다
							//continue Loop1;
							//continue;
						}

						
						System.out.println(i + "*" + j + "=" + i*j);
					}
					
					System.out.println();
		}

	}

}
