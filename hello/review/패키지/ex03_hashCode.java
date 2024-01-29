package 패키지;

public class ex03_hashCode {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		
		System.out.println(str1.equals(str2));
		// 이건 equals 비교
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String클래스는 문자열의 내용이 같을 경우, 동일한 해시코드를 반환하도록 hashCode()에서 오버라이딩 되어있다. (hashCode()는 Object 클래스의 메서드)
		// 따라서 str1과 str2는 "문자열"이 abc로 같기 때문에 항상 같은 해시코드를 반환한다
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		// 반면, System.identityHashCode(Object obj)는 Object 클래스의 hashCode 메서드처럼
		// 객체의 "주소값"으로 해시코드를 생성한다. 따라서 저장되는 메모리 장소가 다르기 때문에 값이 다르게 나오는 것
		// 다시 말해서 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장하고 있는 메서드이다
		// 그래서 str1과 str2는 문자열은 같지만 서로 다른 객체라는 것을 알 수 있다.
		// str1과 str2는 "abc"라는 같은 문자열을 가지고 있지만
		// 결국 System.identitiyHashCode() 메서드에 의하면 str1 !== str2 라는 소리가 된다
		
	}

}

