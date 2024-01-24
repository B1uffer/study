package 예외처리;

import java.io.*;

public class try_catch_finally3 {

	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			
			is = new FileInputStream("fileName");
			os = new FileOutputStream("fileName");
			
			
		} catch(FileNotFoundException e) {
			
			System.out.println("파일이 없기 때문에 예외 발생");
			
		} finally {
			
			try {
				
				is.close();
				os.close();
				
				
			} catch(IOException e) {
				
				
				
			} finally {
				
				System.out.println("자원 해제 도중 예외 발생");
				
			}
			
			
		}

	}

}
