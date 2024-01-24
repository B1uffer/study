package 예외처리;

import java.io.*;

public class try_with_resources {

	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("fileName");
				OutputStream os = new FileOutputStream("fileName");) {
			
			
			
		} catch(Exception e) {
			
			System.out.println("예외 발생");
			
		}
		

	}

}
