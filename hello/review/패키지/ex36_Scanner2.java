package 패키지;

import java.util.Scanner;
import java.io.File;

public class ex36_Scanner2 {

	public static void main(String[] args) throws Exception {
		
		// data2.txt 파일로부터 데이터를 읽어서 합과 평균을 계산하는 예제
		
		Scanner sc = new Scanner(new File("data2.txt"));
		// data2.txt를 Scanner()안에 집어넣어서 얘를 읽을 수 있게 함
		// 소스파일과 다른 디렉토리에 위치한 파일을 읽기 위해선, 파일명에 경로도 함께 지정해주어야 한다.
		
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()) {		// hasNextInt()는 Scanner 객체에 입력값이 Int일때만 true를 반환한다
			
			sum += sc.nextInt();
			cnt++;
			
		}
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + (double)sum/cnt);

	}

}
