package 객체지향_프로그래밍1;

public class ex21_오버로딩 {

	public static void main(String[] args) {
		// MyMath3 참고
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));
		// add(3L, 3), add(3, 3L), add(3L, 3L)의 결과는 모두 6L
		// 하지만 System.out.println(6L);을 수행하면 6이 출력된다
		// 리터럴의 접미사는 출력되지 않는다
		
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
		
		

	}

}
