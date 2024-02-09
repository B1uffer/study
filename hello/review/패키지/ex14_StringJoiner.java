package 패키지;

import java.util.StringJoiner;

public class ex14_StringJoiner {

	public static void main(String[] args) {
		
		// join()과 StringJointer에 대해서
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");		// StringJoiner() 괄호 안 순서를 유의할 것
		
		System.out.println();
		
		System.out.println(sj.toString());
		
		for(String s : arr) {
			
			sj.add(s);
			
			System.out.println(sj.toString());
		}
		
		System.out.println(sj.toString());
	}

}
