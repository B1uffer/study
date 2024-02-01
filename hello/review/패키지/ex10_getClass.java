package 패키지;

public class ex10_getClass {

	public static void main(String[] args) throws Exception {
		
		// Card3 참조
		
		Card3 c = new Card3();
		Card3 c2 = Card3.class.newInstance();

		Class cc = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println();
		
		System.out.println(cc);

		System.out.println();
		
		System.out.println(cc.getClass());				// cc가 참조하는 클래스의 Class 객체를 반환하는 메서드
		
		System.out.println(cc.toGenericString());		// cc가 참조하는 클래스의 타입까지 반환함 Card3은 final, 상수
		
		System.out.println(cc.toString());		// 이게 정상적으로 출력이 되지 않는 이유는 Class 클래스의 toString()을 참조
		
		System.out.println();
		
		System.out.println(c.toString());
		System.out.println(c2.toString());

	}

}
