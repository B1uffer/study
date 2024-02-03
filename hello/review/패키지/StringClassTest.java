package 패키지;

public class StringClassTest {

	public static void main(String[] args) {
		
		// String(String s)
		String s = new String("Hello");
		System.out.println(s);
		System.out.println();
		
		// String(char[] value)
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);		// c = char[] c
		// String s3 = new String(new char[] c3 = {'H', 'e', 'l', 'l', 'o'});
		System.out.println(s2);
		System.out.println();
		
		// String(StringBuffer buf), StringBuffer인스턴스가 가지고 있는 문자열과 같은 내용의 String 인스턴스를 생성함
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(sb);
		System.out.println(s3);
		System.out.println();
		
	}

}
