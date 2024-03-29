package 컬렉션_프레임워크;

import java.util.*;

public class ex29_TreeSet3 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++) {
			
			set.add(new Integer(score[i]));
			
		}
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		// headSet()은 지정한 값보다 '작은' 값들을 반환한다
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
		// tailSet()은 지정한 값보다 '큰' 값들을 반환한다
	}

}
