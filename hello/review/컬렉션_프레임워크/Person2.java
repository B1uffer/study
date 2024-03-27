package 컬렉션_프레임워크;

public class Person2 {
	
	String name;
	int age;
	
	Person2(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public boolean equals(Object obj) {		// HashSet.add의 오버라이딩 1
		
		if(obj instanceof Person2) {
			
			Person2 tmp = (Person2)obj;
			
			return name.equals(tmp.name) && age==tmp.age;		// true
			
		}
		
		return false;
		
	}
	
	/*
	 * 
	 */
	
	public int hashCode() {		// HashSet.add의 오버라이딩 2
		
		return (name + age).hashCode();
		
	}
	
	
	public String toString() {
		
		return name + ":" +age;
		
	}
	
}
