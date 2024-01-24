package 예외처리;

import java.io.*;

public class ex16_메서드에_예외_선언하기6 {

	public static void main(String[] args) {
		
		// main 메서드에서 try catch finally를 선언해서 예외 처리하기
		
		try {
			
			createFile(args[0]);
			System.out.println(createFile(args[0]).getName() + "파일이 성공적으로 생성되었음");
			
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage() + "다시 입력해주시기 바랍니다.");
			
			
		} finally {
			
			
			
		}

	}

	static File createFile(String fileName) throws Exception {		// throws를 이용하여 넘김
		
		if(fileName == null || fileName.equals("")) {
			
			throw new Exception("파일 이름이 유효하지 않아요");
			
		}
		
		File f = new File(fileName);		// File 클래스의 객체를 만듬
		
		f.createNewFile();		// File객체의 createNewFile 메서드를 이용해서 실제로 파일을 만듬
		
		return f;		// 객체를 반환함
		
	}
}
