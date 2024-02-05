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
		
		
		// char x = y.charAt(int index), 지정한 위치(char at, index)에 있는 문자를 알려줌.
		// index는 0부터 시작한다.
		String s4 = "Hello";
		String n = "0123456";
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		System.out.println(s4);
		System.out.println(c2);
		System.out.println(n);
		System.out.println(c3);
		System.out.println();
		
		
		// int x = y.compareTo(String str), 문자열(str)과 사전순서로 비교(compare)함. 같으면 0, 이전이면 음수, 이후면 양수를 반환함
		int i = "aaa".compareTo("aaa"); // String "aaa"는 안됨
		System.out.println(i);		// 똑같으니 0
		int i2 = "aaa".compareTo("bbb");
		System.out.println(i2);		// bbb를 기준으로 aaa가 이전이니 -1
		int i3 = "bbb".compareTo("aaa");
		System.out.println(i3);		// aaa를 기준으로 bbb가 이후니까 1
		int i4 = "bbb".compareTo("sss");
		System.out.println(i4);
		int i5 = "xxx".compareTo("ccc");
		System.out.println(i5);
		System.out.println();
		
		
		// String x = y.concat(String str) : 문자열을 뒤에 덧붙임.
		String s5 = "Hello";
		String s6 = s5.concat(" World");
		System.out.println(s6);
		System.out.println();
		
		
		// boolean x = y.contains(CharSequence s) : 지정된 문자열(s)이 포함되었는지 검사함
		String s7 = "abcdefg";
		boolean b = s7.contains("bc");
		System.out.println(b);
		System.out.println();
		
		
		// boolean x =  y.endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사함
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		System.out.println(b2);
		System.out.println();
		
		
		// boolean x = y.equalsIgnoreCase(String str) : 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교함
		String s8 = "Hello";
		boolean b3 = s8.equalsIgnoreCase("HELLO");
		System.out.println(b3);
		boolean b4 = s8.equalsIgnoreCase("heLLo");
		System.out.println(b4);
		System.out.println();
		
		
		// int x =  y.indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 몇번째인지 위치(index)를 알려줌. 못찾으면 -1을 반환함
		String s9 = "Hello";
		int idx1 = s9.indexOf('o');		// index는 0부터 시작하니까 4가 나오는게 맞다
		System.out.println(idx1);
		int idx2 = s9.indexOf('k');
		System.out.println(idx2);
		System.out.println();
		
		
		// int x = y.indexOf(int ch, int pos) : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치를 알려줌. 못찾으면 -1
		String s10 = "Hello";
		int idx3 = s10.indexOf('e', 0);
		System.out.println(idx3);
		int idx4 = s10.indexOf('e', 2);
		System.out.println(idx4);
		System.out.println();
		
		
		// int indexOf(String str) : 주어진 문자열이 존재하는지 확인해서 그 위치를 알려줌. 없으면 -1.
		String s11 = "ABCDEFG";
		int idx5 = s11.indexOf("CDE");
		System.out.println(idx5);
		int idx6 = s11.indexOf("DCE");
		System.out.println(idx6);
		System.out.println();
		
		
		// String x.intern() : 문자열을 상수풀(constant pool)에 등록함. 이미 상수풀에 같은 내용의 문자열이 있을 경우, 그 문자열의 주소값을 반환함.
		String s12 = new String("abc");
		String s13 = new String("abc");
		boolean b5 = (s12 == s13);		// 얘는 해시주소값까지 비교함. s12와 s13이 String타입이고 new String을 참조하는 인스턴스이므로 해시값이 다르다
		System.out.println(b5);		
		boolean b6 = s12.equals(s13);		// equals(String s)는 매개변수로 받은 문자열과 String 인스턴스의 문자열을 비교함
		System.out.println(b6);
		boolean b7 = s12.intern() == s13.intern();
		System.out.println(b7);
		System.out.println();
		
		
		
		
	}

}
