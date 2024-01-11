package 객체지향_프로그래밍2;

public class ex22_객체를배열로다루기 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		

	}

}
