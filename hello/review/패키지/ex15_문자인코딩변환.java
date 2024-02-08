package 패키지;

import java.util.StringJoiner;		// 이걸 넣어줘야함

public class ex15_문자인코딩변환 {

	public static void main(String[] args) throws Exception {		// 예외로 꼭 보내줘야한다
		
		// 어떻게 돌아가는진 알겠는데 처음 보는 코드들이 많으니 다시 한 번 볼것
		
		String str = "가";
		
		byte[] bArr = str.getBytes("UTF-8");		// getByte 사용
		byte[] bArr2 = str.getBytes("CP949");
		
		System.out.println("UTF-8 : " + joinByteArr(bArr));
		System.out.println("CP949 : " + joinByteArr(bArr2));
		
		System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
		System.out.println("CP949 : " + new String(bArr2, "CP949"));
		

	}

	
	static String joinByteArr(byte[] bArr) {		// joinByteArr이라는 메서드 작성
		
		StringJoiner sj = new StringJoiner(":", "[", "]");		// StringJoiner 클래스, 괄호 안 순서와 콘솔값을 유심히 볼 것
		
		for(byte b : bArr) {
			
			sj.add(String.format("%02X",b));
			
		}
		
		return sj.toString();
		
	}
	
	// UTF-8은 한글 한 글자를 3byte로 표현하고, CP949는 2byte로 표현함.
	// 그래서 문자 '가'의 경우 UTF-8로는 0xEAB80이고, CP949로 0xB0A1임
}
