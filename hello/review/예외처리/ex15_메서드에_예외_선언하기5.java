package 예외처리;

import java.io.*;

public class ex15_메서드에_예외_선언하기5 {

	public static void main(String[] args) {
		
		// createFile 메서드에서 예외를 선언하여 처리하기
		
		File f = createFile(args[0]);		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성
		
		System.out.println(f.getName() + "파일 생성 완료");
		
		
	}
	
	static File createFile(String fileName) {		// File 타입은 import java.io.*; 를 해야 가져올 수 있음
		
		try {
			
			if(fileName == null || fileName.equals("")) {	// fileName이 null이거나 아무것도 적지 않았을 때
				
				throw new Exception("파일이름이 유효하지 않습니다.");
				
			}
			
		} catch(Exception e) {
			
			
			fileName = "제목없음.txt";		// 예외에 대해 fileName의 이름을 초기화해줌
						
			
		} finally {
			
			File f = new File(fileName);
			createNewFile(f);
			return f;
			
		}
		
	}
	
	static void createNewFile(File f) {
		
		try {
			
			f.createNewFile();
			
		} catch(Exception e) {
			
			
			
		}
		
	}
}
