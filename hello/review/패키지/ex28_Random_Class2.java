package 패키지;

import java.util.*;

public class ex28_Random_Class2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] number = new int[100];		// 배열 100개짜리
		int[] counter = new int[10];		// 배열 10개짜리
		
		for(int i=0; i<number.length; i++) {
			
			System.out.print(number[i] = rand.nextInt(10));		// nextInt()는 int타입의 난수를 반환함
			// System.out.print(number[i] = (int)(Math.random() * 10);
			// 0<= x < 10 범위의 정수를 반환한다
		}
		
		System.out.println();
		
		for(int i=0; i<number.length; i++) {
			
			counter[number[i]]++;		// number배열 안에 있는 숫자들을 counter배열에 집어넣는다
			
		}
		
		for(int i=0; i<number.length; i++) {
			
			System.out.println(i +"의 개수 : "+ printGraph('#',counter[i]) + " " + counter[i]);
		}
		
	}
	
	public static String printGraph(char ch, int value) {
		
		char[] bar = new char[value];		// char배열 타입의 bar은 int타입의 value만큼 배열을 갖는다
		
		for(int i=0; i<bar.length; i++) {		// bar.length는 value값만큼
			
			bar[i] = ch;		//bar[i]에서 i의 값만큼 char타입의 c를 반환한다
			
		}
		
		return new String(bar);
		
	}

}
