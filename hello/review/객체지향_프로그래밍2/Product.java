package 객체지향_프로그래밍2;

public class Product {
	
	int price;		// 제품의 가격
	int bonusPoint;		// 제품 구매시 제공하는 보너스 포인트
	
	Product(int price)	{		// 제품에 관한 메서드
		this.price = price;		// 이 메서드의 제품 가격은 클래스의 제품 가격과 같다
		bonusPoint = (int)(price/10.0);		// 보너스 포인트는 제품의 가격에 대해 10%
		
	}
	
	Product() {
		
	}
		
}
