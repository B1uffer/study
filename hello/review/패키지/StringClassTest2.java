package 패키지;

public class StringClassTest2 {

	public static void main(String[] args) {
		
		// int x = y.lastIndexOf(int ch) : 지정된 문자 또는 문자코드를 문자열의 왼쪽에서 오른쪽으로 찾아서 위치를 알려줌. 못찾으면 -1
		// lastIndexOf는 지정된 문자, 문자코드를 오른쪽 끝에서부터 찾은 다음, 왼쪽에서 오른쪽으로 가는 index순의 번호를 출력해준다. 
		// 오른쪽부터 세는 것이 아니고 왼쪽부터 세긴 하는데, 해당 문자 ch가 중복될 경우 가장 오른쪽에 있는 ch의 index를 출력해준다
		String s = "java.lang.Object";
		int idx1 = s.lastIndexOf('.');		// 그래서 얘가 9가 나오는것
		System.out.println(idx1);
		int idx2 = s.indexOf('.');		// 얘는 걍 indexOf니까 가장 왼쪽에 있는 문자를 출력해줌
		System.out.println(idx2);
		System.out.println();
		
		// int x = y.lastIndexOf(String str) : 지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아 위치를 알려줌. 못찾으면 -1
		String s1 = "java.lang.java";
		int idx3 = s1.lastIndexOf("java");
		System.out.println(idx3);
		int idx4 = s1.indexOf("java");
		System.out.println(idx4);
		System.out.println();
		
		// int x = y.length() : 문자열 길이 알려줌
		String s2 = "Hello";
		int length = s2.length();
		System.out.println(length);
		System.out.println();
		
		// String x = y.replace(char old, char nw) : 문자열 중 문자(old)를 새로운 문자(nw)로 바꾼 문자열 반환
		String s3 = "Hello";
		String s4 = s3.replace('H', 'C');	// 여긴 ' '를 썼다
		System.out.println(s4);
		System.out.println();
		
		// String x = y.replace(CharSequence old, CharSequence nw) : 문자 열 중 문자열(old)을 새로운 문자열로 모두 바꾼 문자열 반환
		String s5 = "Hellollo";
		String s6 = s5.replace("ll", "LL");		// 여긴 " "를 썼음
		System.out.println(s6);
		System.out.println();
		
		// String x = y.replaceAll(String regex, String replacement) :
		// 문자열 중 지정된 문자열(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두 변경함
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println(r);
		System.out.println();
		
		// String[] split(String regex) : 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환함
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		// animals.split(","); 에서 괄호 안 특히 " " 안에 있는 문자로 String 문자열을 나눈다
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		
		// String[] x = y.split(String regex, int limit) : 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담안 반환함.
		// 단, 문자열 전체를 지정된 수(limit)로 자름
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(",", 2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		// System.out.println(arr2[2]); 이건 animals2.split(",", 2)에서 지정된 수가 2니까 총 2개로 자르는 것이다.
		// 따라서 arr2[0]에는 dog가 담겨있고 나머지인 cat,bear은 arr[1]에 담겨있는것. ,를 기준으로 총 2개로 나누라고 했으니까
		// 그러니 arr2[2]는 존재하지 않기 때문에 예외가 발생한다. 2를 3으로 바꿔주면 잘 됨. 왜냐하면 배열에 bear가 들어가니까
		System.out.println();
		
		// boolean x = y.startsWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사함
		String s7 = "java.lang.Object";
		boolean b = s7.startsWith("java");
		System.out.println(b);
		boolean b2 = s7.startsWith("lang");
		System.out.println(b2);
		System.out.println();
		
		// String x = y.substring(int begin)
		// String x = y.subString(int begin, int end) :
		// 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻음.
		// 이 때, 시작위치의 문자는 범위에 포함되지만 끝 위치의 문자는 범위에 포함되지 않음.
		String s8 = "java.lang.Object";
		String c = s8.substring(10);
		System.out.println(c);
		String c2 = s8.substring(5, 9);		// 9까지니까 lang.에서 .가 9번째인데
		System.out.println(c2);		// 실행해보면 끝 위치의 문자인 .는 범위에 포함되지 않아 실행되지 않음을 알 수 있다
		System.out.println();
		
		// String x = y.toLowerCase() : String 인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환함
		// 반대는 String x = y.toUpperCase()
		String s9 = "Hello";
		String s10 = s9.toLowerCase();
		System.out.println(s10);
		System.out.println();
		
		// String x = y.toString() : String 인스턴스에 저장되어 있는 문자열을 반환함
		String s11 = "Hello";
		System.out.println(s11);
		String s12 = s11.toString();
		System.out.println(s12);
		System.out.println();
		
		// String x = y.toUpperCase() : String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환함
		// 반대는 String x = y.toLowerCase()
		String s13 = "Hello";
		String s14 = s13.toUpperCase();
		System.out.println(s14);
		System.out.println();
		
		// String trim() : 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환함. 문자열 중간에 있는 공백은 제거되지 않음
		String s15 = "     Hello World     ";
		System.out.println(s15);
		String s16 = s15.trim();
		System.out.println(s16);
		System.out.println();
		
		// static String valueOf(boolean b)
		// static String valueOf(char c)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(float f)
		// static String valueOf(double d)
		// static String valueOf(Object o)
		// 지정된 값을 문자열로 변환하여 반환함. 참조변수의 경우, toString()을 호출한 결과를 반환한다
		String bb = String.valueOf(true);
		System.out.println(bb);
		String cc = String.valueOf('a');
		System.out.println(cc);
		String ii = String.valueOf(100);
		System.out.println(ii);
		String ll = String.valueOf(100L);
		System.out.println(ll);
		String ff = String.valueOf(100f);
		System.out.println(ff);
		String dd = String.valueOf(100.0);
		System.out.println(dd);
		
		java.util.Date dat = new java.util.Date();
		// java.util.Date dat = new java.util.Date();에서 dat java.util.Date 타입의 dat 인스턴스는 현재 시간을 가짐
		String date = String.valueOf(dat);
		System.out.println(date);
		
		
		// CharSequence는 JDK 1.4부터 추가된 인터페이스로 String, StringBuffer 등의 클래스가 구현했음
		// contains(CharSequence s), replace(CharSequence old, CharSequence nw)는 JDK 1.5부터 추가됨
	}

}
