package 패키지;

public class String메모장 {

	public static void main(String[] args) {

		String a = "a"; // a는 "a" 라는 값을 메모리 한 켠에 저장해둔다.
		System.out.println(System.identityHashCode(a));
		System.out.println();
		
		String b = "b"; // b 또한 "b"라는 값을 메모리 한 켠에 저장해두는데, 이는 a와 다른 메모리값이다.
		System.out.println(System.identityHashCode(b));
		System.out.println();
		
		a = a + b; 		
		System.out.println(System.identityHashCode(a));
		
		String str = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str));		// 얘랑
		System.out.println(System.identityHashCode(str2));		// 얘는 같은 해시값, 같은 메모리값을 참조하고 있음
		System.out.println(System.identityHashCode(str3));		// 그런데 얘랑
		System.out.println(System.identityHashCode(str4));		// 얘는 다른 해시값, 다른 메모리값을 참조하고 있음
		
		System.out.println();
		
		System.out.println(str.equals(str2));		// 문자열의 내용 비교하기
		System.out.println(str.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str4));
		
		System.out.println();
		
		System.out.println(str == str2);		// String 인스턴스 주소 판별하기
		System.out.println(str == str3);
		System.out.println(str2 == str4);
		System.out.println(str3 == str4);
	}
}
