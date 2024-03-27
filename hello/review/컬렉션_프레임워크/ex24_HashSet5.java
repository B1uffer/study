package 컬렉션_프레임워크;

import java.util.*;

public class ex24_HashSet5 {

	public static void main(String[] args) {
		
		// Person2 참조
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person2("B1uffer", 14));
		set.add(new Person2("B1uffer", 14));
		
		System.out.println(set);
		
		
		System.out.println();
		
		Person2 p = new Person2("B1uffer.jr", 12);
		
		int hashCode1 = p.hashCode();
		int hashCode2 = p.hashCode();
		
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		
		System.out.println();
		
		// 오버라이딩을 통해 작성된 hashCode()가 만족해야 할 세가지
		// 1. 실행중인 어플리케이션 내 동일한 객체에 대해 여러번 hashCode()를 호출해도 동일한 int값을 반환해야함(equals 메서드에 사용된 멤버변수가 불변이라는 가정)
		
		p.age = 10;
		System.out.println(p);
		
		int hashCode3 = p.hashCode();
		System.out.println(hashCode3);
		
		
		// 2. equals 메서드를 이용한 비교에 의해 true를 얻은 두 객체에 대해서 각각 hashcode()를 호출해서 얻느 결과는 반드시 같아야함
		// 인스턴스 p1, p2에 대해 equals 메서드를 이용한 비교의 결과인 변수 b의 값이 true라면, 
		// hashCode1과 hashCode2의 값이 같은 것과 같은 의미
		
		// 3. equals 메서드를 호출했을 때 false를 반환하는 두 객체는 hashCode() 호출에 대해 같은 int값을 반환하는 경우가 있어도 괜찮지만,
		// 해싱(hashing)을 사용하는 컬렉션의 성능을 향상시키기 위해선 다른 int값을 반환하는 것이 좋음
		// 해시코드를 사용하는 Hashtable이나 HashMap과 같은 컬렉션의 성능을 위해선 가능한 서로 다른 값을 반환하도록 hashCode()를 작성해야함
		// 결과가 중복되는 경우가 많아질수록 검색속도가 현저히 느려진다
		
		// 두 객체에 대해서 equals 메서드의 결과가 true면 두 객체의 해시코드는 반드시 같아야 하지만
		// 해시코드가 같다고 해서 equals 메서드의 결과값이 반드시 true가 아닐 수도 있음
		
	}
	
}


/*
 * hashCode()는 String클래스의 hashCode()를 이용해서 구현했음
 * 
 * public int hashCode() {
 * 
 * 		return (name + age).hashCode();
 * 
 * 	}
 * 
 * 위 코드를 JDK 1.8부터 추가된 java.util.Object클래스의 hash()를 이용해서 작성하면,
 * 
 * public int hashCode() {
 * 
 * 		return Objects.hash(name, age);
 * 
 * 	}
 * 
 */
