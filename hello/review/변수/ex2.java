package 변수;

public class ex2 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + " y : " + y);
		System.out.println();
		
		tmp = x;
		x = y;
		y = tmp;		// tmp = x = y = tmp
		
		System.out.println("x : " + x + "y : " + y);
		

	}

}
