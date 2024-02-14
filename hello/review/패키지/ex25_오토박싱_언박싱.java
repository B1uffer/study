package 패키지;

public class ex25_오토박싱_언박싱 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// 기본형을 참조형으로 형변환하기(형변환 생략 가능)
		Integer intg = (Integer)i;		// Integer intg = Integer.valueOf(i);
		System.out.println(intg);
		
		Object obj = (Object)i;		// Object obj = (Object)Integer.valueOf(i);
		System.out.println(obj);
		
		System.out.println();
		
		Long lng = 100L;		// Long lng = new Long(100L);
		System.out.println(lng);
		
		int i2 = intg + 10;		// 참조형과 기본형 간 연산이 가능하다
		System.out.println(i2);
		long l = intg + lng;		// 참조형 간에 덧셈도 가능하다
		System.out.println(l);
		
		System.out.println();
		
		Integer intg2 = new Integer(20);
		System.out.println(intg2);
		int i3 = (int)intg2;		// 참조형을 기본형으로 형변환도 할 수 있다(형변환 생략 가능)
		System.out.println(i3);
		
		Integer intg3 = intg2 + i3;		// 참조형 + 기본형
		System.out.println(intg3);
		
	}

}

	// 컴파일 전 Integer intg = (Integer)i;, 컴파일 후 Integer intg = Integer.valueOf(i);
	// 컴파일 전 Object obj = (Object)i;, 컴파일 후 Object obj = (Object)Integer.valueOf(i);
	// 컴파일 전 Long lng = 100L;, 컴파일 후 Long lng = new Long(100L);
