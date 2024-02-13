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
		// 또한 StringBuffer에 대해 y.insert(int pos, xxxx)에서 pos가 똑같은 수가 반복되고 여러 y.insert()가 작성될 경우
		// 이전에 작성된 문장에 대한 출력은 이후에 작성된 문장의 출력에 밀려난다.
		// 아래의 코드를 실행해보면 뭔 말인지 이해가 될 것
		
		StringBuffer sb19 = new StringBuffer("0123456");
		
		// StringBuffer insert(int pos, boolean b)	
		System.out.println(sb19.insert(4, false));
		// StringBuffer insert(int pos, char c)
		System.out.println(sb19.insert(4, 'A'));
		// StringBuffer insert(int pos, char[] str)
		System.out.println(sb19.insert(4, new char[] {'a','b','c'}));
		// StringBuffer insert(int pos, double d)
		System.out.println(sb19.insert(4, 10.0));
		// StringBuffer insert(int pos, float f)
		System.out.println(sb19.insert(4, 20.0f));
		// StringBuffer insert(int pos, int i)
		System.out.println(sb19.insert(4, 30));
		// StringBuffer insert(int pos, long l)
		System.out.println(sb19.insert(4, 40L));
		// StringBuffer insert(int pos, Object obj)
		System.out.println(sb19.insert(4, sb18.toString()));
		// StringBuffer insert(int pos, String str)
		System.out.println(sb19.insert(4, "Hello,World"));
		System.out.println();
		
		// int x = y.length() : StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환함.
		StringBuffer sb20 = new StringBuffer("0123456"); // 얘 length()는 7, 총 7칸이니까
		int length = sb20.length();
		System.out.println(length);
		System.out.println();
		// 주의 : index()와 length()를 착각하지 말 것. index()는 0부터, length()는 1부터
		
		// StringBuffer replace(int start, int end, String str) : 지정된 범위(int start, int end)의 문자들을
		// 주어진 문자열로 바꿈(String str). end 위치의 문자는 범위에 포함되지 않는다.
		StringBuffer sb21 = new StringBuffer("0123456");
		System.out.println(sb21.replace(0, 7, "Hello, World!"));
		System.out.println();
		
		// StringBuffer reverse() : StringBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열함
		StringBuffer sb22 = new StringBuffer("6543210");
		System.out.println(sb22);
		System.out.println(sb22.reverse());
		System.out.println();
		
		// void setCharAt(int index, char ch) : 지정된 위치의 문자를 주어진 문자(ch)로 바꿈.
		StringBuffer sb23 = new StringBuffer("0123456");
		sb23.setCharAt(4, 'A');		// sb23.setCharAt(4, 'A', 0, 'B'); 와 같이 연속으로 작성 불가능
		System.out.println(sb23);
		System.out.println();
		
		// void setLength(int newLength) :
		// 지정된 길이로 문자열의 길이를 변경함. 길이를 늘리는 경우 나머지 빈 공간을 널문자 '\u0000'으로 채움.
		StringBuffer sb24 = new StringBuffer("0123456");		// 현재 문자의 길이 7
		System.out.println(sb24.length());
		sb24.setLength(3);		// StringBuffer 내 문자열 길이를 3으로 바꿈
		System.out.println(sb24.length());
		System.out.println(sb24);
		sb24.setLength(7);		// StringBuffer.length()를 다시 7로 바꿈
		System.out.println(sb24.length());
		System.out.println(sb24);		// 그랬더니 기존에 사라진 문자열들은 다시 돌아오지 않음
		System.out.println();
		
		// String toString() : StringBuffer 인스턴스의 문자열을 String으로 반환한다
		StringBuffer sb25 = new StringBuffer("저는 매우 졸린 상태입니다.");
		String sleeping = sb25.toString();		// toString()에 의해 StringBuffer 인스턴스의 문자열은 String타입이 됨
		System.out.println(sleeping);
		System.out.println();
		
		// String substring(int start) / String substring(int start, int end) : 
		// 지정된 범위 내 문자열을 String으로 뽑아서 반환함. 시작위치(start)만 지정하면 시작위치부터 문자열 끝까지 뽑아서 반환함.
		StringBuffer sb26 = new StringBuffer("ABCDEFG");
		String st1 = sb26.substring(1);		// Start를 1로 설정
		System.out.println(st1);
		String st2 = sb26.substring(0, 4);		// end는 자기자신을 포함하지 않는다....
		System.out.println(st2);		// end가 4이므로 4는 포함되지 않는다. 따라서 0부터 3까지 문자열을 String으로 뽑는다
		
	}

}
