package 객체지향_프로그래밍2;

public class test{

	public static void main(String[] args) {
		
		testing as = new testing(3, 5);
		
		System.out.println(as.alpha());
		System.out.println(as.beta());

		
		t2 ad = new t2();
		
		ad.a = 3;
		ad.b = 5;
		System.out.println(ad.alpha(6));
		
		ad.seta();
		
	}

}
