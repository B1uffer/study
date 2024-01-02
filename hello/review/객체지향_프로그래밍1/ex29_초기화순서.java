package 객체지향_프로그래밍1;

public class ex29_초기화순서 {

	public static void main(String[] args) {
		
		// product 클래스 참조
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
		
	}

}
