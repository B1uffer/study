package 컬렉션_프레임워크;

import java.util.*;

public class ex23_HashSet4 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("Children", 24));
		set.add(new Person("Bluffer", 19));
		set.add(new Person("B1uffer", 19)); 

		System.out.println(set);
	}

}

	// HashSet의 add()는 중복된 값이 있으면 같은 것으로 간주하고 저장하지 않는데,
	// Class 안의 toString을 활용한 값 출력에 대한 결과값을 보니 같은 값의 해시값이 다른 것으로 간주되어 두 번 출력됨
	





/* class Person {
	
	String name;
	int age;

	Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public String toString() {

		return name + " : " + age;

	}

	
}

*/

