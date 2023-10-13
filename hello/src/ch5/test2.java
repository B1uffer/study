package ch5;

public class test2 {

	public static void main(String[] args) {

	
		// 메소드명은 sumText입니다.
		// 매개변수는 int랑 String을 받고,
		// 변수이름이 age랑 name이에요.
		// 반환값으로 이름name, 나이age가 나오면 됩니다. ex) 김철수, 25
		// main에서 출력하세요.
		
		String name = "김철수";
		int age = 25;
		
		System.out.println(sumText(name, age));
		
	}

	static String sumText(String name, int age) {
		
		return name +", " + age;
	}

	
	
	
}
