package 패키지;

public class ex19_StringBuffer_class {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("0123456");
		StringBuffer sb2 = new StringBuffer("ABCDEFGHIJK");
		sb.append('7').append(89);		// 이거 잘됨
		System.out.println(sb);
		System.out.println();
		sb2.append('L').append("MN").append("OPQRSTU").append("V").append("WXY").append('Z');
		System.out.println(sb2);
		System.out.println();
		
		StringBuffer sb3 = sb.append(1011);
		sb3.append(10.0f);
		System.out.println(sb3);
		System.out.println();
		
		System.out.println("sb = " + sb.deleteCharAt(0));
		System.out.println();
		
		System.out.println("sb = " + sb.insert(0, 0));
		System.out.println();
		
		System.out.println("sb2 = " + sb2.delete(0, 2));		// end는 2니까 0~1까지의 문자열만 삭제함
		System.out.println();
		
		System.out.println("sb2 = " + sb2.insert(0, "AB"));
		System.out.println();
		
		System.out.println("sb = " + sb.replace(0, 2, "AB"));
		System.out.println();
		
		System.out.println("sb2 = " + sb2.replace(0, sb2.length(), "가나다라마바사아자차카타파하"));
		System.out.println();
		
		System.out.println("sb's bufferSize = " + sb.capacity());
		System.out.println("sb2's bufferSize = " + sb2.capacity());
		System.out.println();
		// 인스턴스의 buffersize를 알려주는 y.capacity()의 경우 int값이다
		
		// 위는 buffersize이고 아래는 length
		System.out.println(sb.length());
		System.out.println(sb2.length());
		
	}

}
