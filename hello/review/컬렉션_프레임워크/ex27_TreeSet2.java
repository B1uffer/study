package 컬렉션_프레임워크;

import java.util.*;

public class ex27_TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz"); set.add("elephant"); set.add("elevator");
		set.add("fan"); set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));		// subSet()은 범위검색의 결과를 반환한다
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		// dZZZZ는 포함되었지만 dzzzz는 포함되지 않았다
		
		// 대문자가 소문자보다 우선하기 때문에 대소문자가 섞여 있는 경우 의도한 바와 다른 결과를 얻을 수 있기 때문에 대소문자를 통일하는것이 좋음
		
		// 반드시 대소문자가 포함되어야 하거나 다른 방식으로 정렬해야하는 경우 Comparator를 활용하면 된다
		
	}

}
