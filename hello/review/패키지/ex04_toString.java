package 패키지;

public class ex04_toString {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card("DIAMOND", 1);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
	}

}

	/*
		toString()의 Object에 대한 정의
		
		public String toString() {
		
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		}

		이 클래스에서 toString()을 호출한 결과 해시코드를 출력한 이유
			Card클래스에서 Object클래스로부터 상속받은 toString()을 오버라이딩 하지 않았기 떄문!
			
			Card 클래스에 toString()을 오버라이딩 하지 않은 결과,
				Card인스턴스에 toString()을 호출하게 되면 Object 클래스의 toString()이 그대로 호출된다. 위의 코드 그대로.
				
			서로 다른 인스턴스에 대해 toString()을 호출했기 때문에(c1, c2, c3) 클래스의 이름은 Card로 같아도 해시코드값은 다르다.

	*/