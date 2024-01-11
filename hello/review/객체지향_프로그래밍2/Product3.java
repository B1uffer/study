package 객체지향_프로그래밍2;

public class Product3 {

	int price;		// 제품의 가격
	int bonusPoint;		// 제품을 구매했을때 얻을 수 있는 포인트
	
	Product3(int price) {		// 제품을 구매하면..
		this.price = price;		// 제품 가격
		bonusPoint = (int)(price/10.0);		// 포인트는 구매한 가격의 10%
		
	}
	
	Product3() {		// Product3 메서드 생성
		price = 0;
		bonusPoint = 0;
		// 초깃값
		
	}
}
