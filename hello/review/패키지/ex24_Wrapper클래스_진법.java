package 패키지;

public class ex24_Wrapper클래스_진법 {

	public static void main(String[] args) {
		
		int i = new Integer("100").intValue();
		System.out.println(i);
		int i2 = Integer.parseInt("100");
		System.out.println(i2);
		Integer i3 = Integer.valueOf("100");
		System.out.println(i3);
		System.out.println();
		
		int i4 = Integer.parseInt("100", 2);
		System.out.println(i4);
		int i5 = Integer.parseInt("100", 8);
		System.out.println(i5);
		int i6 = Integer.parseInt("100", 16);
		System.out.println(i6);
		int i7 = Integer.parseInt("FF", 16);
		System.out.println(i7);
		System.out.println();
		// parseInt()는 반환타입이 기본형
		
		int i8 = Integer.valueOf("100", 2);
		System.out.println(i8);
		int i9 = Integer.valueOf("100", 8);
		System.out.println(i9);
		int i10 = Integer.valueOf("100", 16);
		System.out.println(i10);
		int i11 = Integer.valueOf("FF", 16);
		System.out.println(i11);
		System.out.println();
		// valueOf()는 반환타입이 래퍼클래스 타입
		
		
	}

}
