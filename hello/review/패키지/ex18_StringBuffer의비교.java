package 패키지;

public class ex18_StringBuffer의비교 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println("sb == sb2 ? " + (sb==sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		String s = sb.toString();		// 출력은 abc로 똑같지만, 인스턴스 타입이 String으로 바뀐다
		String s2 = sb2.toString();
		System.out.println(s);
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));		// true
		// 왜냐하면 String이라는 문자열값으로 바뀌었기 때문에

	}

}
