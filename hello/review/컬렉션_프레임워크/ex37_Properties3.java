package 컬렉션_프레임워크;

import java.util.*;
import java.io.*;

public class ex37_Properties3 {

	public static void main(String[] args) {
		
		// ex36과 반대로 Properties에 저장된 데이터를 store()와 storeToXML()을 이용해서 파일로 저장하는 방법
		// storeToXML()로 저장한 XML은 Editplus나 Eclipse에서 한글편집이 가능하므로
		// 데이터에 한글이 포함된 경우 store()보다 storeToXML()을 활용해 XML로 저장하는것이 좋음
		
		
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
