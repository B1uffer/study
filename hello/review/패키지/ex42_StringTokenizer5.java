package 패키지;

import java.util.*;

public class ex42_StringTokenizer5 {

	public static void main(String[] args) {
		
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println(result.length);
		System.out.println();
		
		
		for(int i=0; i<result.length; i++) {
			
			System.out.print(result[i] + "|");		// result = data.split(",")
			
		}
		
		System.out.println("개수 : " + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens();i++) {
			
			System.out.print(st.nextToken() + "|");		// st = new StringTokenizer(data, ",")
			
		}
		
		System.out.println("개수 : " + i);
	}

}
