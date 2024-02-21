package 패키지;

import java.util.Scanner;
import java.io.File;

public class ex37_Scanner3 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new File("data3.txt"));
		// c:\jdk1.8\work\ch9에 data3.txt
		int cnt = 0;
		int totalSum = 0;
		
		while(sc.hasNextLine()) {		// hasNextLine() : Scanner에 들어오는 값이 int값일때만 true
			
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");		// useDelimiter()를 통해 ,로 구분한다
			
			int sum = 0;
			
			while(sc2.hasNextInt()) {		// Scanner 타입의 sc2에 들어오는 값이 int일때만,
				
				sum += sc2.nextInt();
				
				
			}
			
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
			
		}
		
		System.out.println("Line : " + cnt + ", Total : " + totalSum);

	}

}
