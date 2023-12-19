package 연산자;

public class ex2 {

	public static void main(String[] args) {
		
		int i = 5, j = 0;
		j = i++;
		System.out.println("j = i++ 실행 후, i = " + i + "\tj = " + j);
		
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j = ++i 실행 후, i =" + i + "\t j = " + j);
	}

}
