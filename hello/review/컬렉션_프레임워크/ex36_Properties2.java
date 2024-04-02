package 컬렉션_프레임워크;

import java.io.*;
import java.util.*;

public class ex36_Properties2 {

	public static void main(String[] args) {
		
		//외부파일(input.txt)로부터 데이터를 입력받아서 계산결과를 보여주는 예제
		// 외부파일의 형식은 라인단위로 키와 같이 = 로 연결된 형태여야 하며 주석라인은 첫 번째 문자가 # 여야 함
		
		// 정해진 규칙대로만 파일을 작성하면 load()를 호출하는 것만으로 쉽게 데이터를 읽어올 수 있다
		
		
		// commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료하게끔 한다
		if(args.length != 1) {
			
			System.out.println("USAGE : java PropretiesEx2 INPUTFILENAME");
			System.exit(0);
			
		}
		
		Properties prop = new Properties();
		
		String inputFile = args[0];
		
		
		
		try {
			
			prop.load(new FileInputStream(inputFile));		
			// void load(InputStream inStream) 지정된 InputStream으로부터 목록을 읽어서 저장한다
			
		} catch(IOException e) {
			
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
			
		}
		
		
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");		// ,로 구분한다
		
		
		int max = 0, min = 0;
		int sum = 0;
		
		for(int i=0; i<data.length; i++) {
			
			int intValue = Integer.parseInt(data[i]);	//
			
			if(i==0) {
				
				max = min = intValue;
				
			}
			
			if(max < intValue) {
				
				max = intValue;
				
			} else if(min > intValue) {
				
				min = intValue;
				
			}
			
			sum += intValue;
			
			
		}
		
		System.out.println("이름 : " + name);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum*100.0/data.length)/100);
	}
	
	
	// 인코딩 문제로 한글이 깨질 수 있기 때문에 한글을 입력받으려면 코드를 변경해야한다
	
	// String name = prop.getProperty("name");
	// try {
	// 			name = new String(name.getBytes("8859_1"), "EUC-KR");
	// 		} catch(exception e) {}
	
	// 파일로부터 읽어온 데이터의 인코딩을 라틴문자집합(8859_1)에서 한글완성형(EUC-KR)로 변환해주는 과정을 추가했다.
	// 우리가 사용하는 OS의 기본 인코딩이 유니코드가 아니기 때문이라고 함
	
}
