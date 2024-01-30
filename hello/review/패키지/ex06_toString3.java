package 패키지;

public class ex06_toString3 {

	public static void main(String[] args) {
		
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("DIAMOND", 5);
		Card2 c3 = new Card2("CLOVER", 12);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
