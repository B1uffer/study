package 패키지;

public class StringBufferTest {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		
		// StringBuffer x = new StringBuffer() : 16문자를 담을 수 있는 버퍼(buffer)를 가진 StringBuffer 인스턴스 생성
		StringBuffer sb = new StringBuffer();
		
		// StringBuffer(int length) : 지정된 개수(int length)의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스 생성
		StringBuffer sb2 = new StringBuffer(10);		// 10개의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스
		
		// StringBuffer(String str) : 지정된 문자열값(String str)을 갖는 StringBuffer 인스턴스 생성
		StringBuffer sb3 = new StringBuffer("Hi");
		System.out.println(sb3);
		System.out.println();
		
		// StringBuffer append(Object obj) : 매개변수로 입력된 값을 문자열로 변환해서 StringBuffer()에 저장된 값 뒤에 덧붙임
		StringBuffer sb4 = new StringBuffer("abc ");
		StringBuffer sb5 = sb4.append(true);
		System.out.println(sb5);
		StringBuffer sb6 = sb4.append('A');		// char c이기 때문에 문자를 하나만 아키코드로 반환할 수 있다
		System.out.println(sb6);
		StringBuffer sb7 = sb4.append(new char[] {'a','b','c'});
		System.out.println(sb7);
		StringBuffer sb8 = sb4.append(10.0f);
		System.out.println(sb8);
		StringBuffer sb9 = sb4.append(20);
		System.out.println(sb9);
		StringBuffer sb10 = sb4.append(10L);
		System.out.println(sb10);
		StringBuffer sb11 = sb4.append(sb3.toString());
		System.out.println(sb11);
		StringBuffer sb12 = sb4.append(new String("/"));
		System.out.println(sb12);
		StringBuffer sb13 = sb4.append(new String("Hello, World!"));
		System.out.println(sb13);
		System.out.println();
		
		// int x = y.capacity() : StringBuffer 인스턴스의 버퍼(buffer) 크기를 알려줌.
		// length()는 버퍼에 담긴 문자열의 길이를 알려줌. int x = y.length(); 형태로 사용한다
		
		StringBuffer sb14 = new StringBuffer(100);
		sb14.append("abcd");
		
		int bufferSize = sb14.capacity();	// capacity()는 StringBuffer의 크기를 알려준다
		System.out.println(bufferSize);		// StringBuffer(100)이니까 100
		
		int stringSize = sb14.length();		// sb14 = StringBuffer니까 이 StringBuffer 안에 있는 문자열 길이를 알려줌
		System.out.println(stringSize);		// 4칸\
		System.out.println();
		
		// char x = y.charAt(int index) : 지정된 위치(index)에 있는 문자를 반환함
		StringBuffer sb15 = new StringBuffer("123456");
		char c = sb15.charAt(5);
		// char c = sb15.charAt(sb15.length()); 의 경우 예외가 발생한다
		System.out.println(c);
		System.out.println();
		
		// StringBuffer x = y.delete(int start, int end) : 시자위치부터 끝위치(start, end) 사이에 있는 문자를 제거함.
		// 단, 끝 위치의 문자는 제외함. 가령 end = 5라면 5 위치의 문자는 제거하지 않는다.
		StringBuffer sb16 = new StringBuffer("0123456");
		StringBuffer sb17 = sb16.delete(3,6);
		System.out.println(sb17);		// 3부터 6까지인데 6은 제거되지 않았다
		System.out.println();
		
		// StringBuffer deletecharAt(int index) : 지정된 위치(index)의 문자를 제거함
		StringBuffer sb18 = new StringBuffer("0123456");
		sb18.deleteCharAt(3);
		System.out.println(sb18);
		System.out.println();
		
		// StringBuffer insert(int pos, Object obj) : 두 번째 매개변수로 받은 값을 문자열로 반환하여 지정된 위치에 추가함.
		// pos는 0부터 시작한다
		
		StringBuffer sb19 = new StringBuffer("0123456");
		
		// StringBuffer insert(int pos, boolean b)	
		System.out.println(sb19.insert(4, false));
		// StringBuffer insert(int pos, char c)
		System.out.println(sb19.insert(4, 'A'));
		
	}

}
