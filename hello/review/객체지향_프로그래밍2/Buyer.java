package 객체지향_프로그래밍2;

public class Buyer {
	
	int money = 1000;	// 구매자의 돈
	int bonusPoint = 0;	// 구매자의 보너스 포인트
	Product[] item = new Product[10];		// 구매한 제품을 저장하기 위한 배열 10칸
	int i = 0;		// item[]에 들어갈 카운팅 변수
	
	
	void buy(Product p) {
		if(money < p.price) {	// 돈이 부족할 경우
			
			System.out.println("잔액이 부족합니다.");
			return;	// 돌아감
			
		}
		
		// 돈이 충분하다면
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;		// 구매한 제품 p를 item[i] 배열에 저장한다
		System.out.println("물건" + p + "을(를) 구매했습니다.");
		
	}
	
	void summary() {		// 구매한 제품에 대한 정보를 요약해서 보여주는 메서드
		int sum = 0;		// 제품들의 가격 합계
		String itemList = "";		// 구입한 제품 목록
		
		for(i = 0; i < item.length; i++) {		// for문을 통해서 item[i]에 제품이 없다면 멈추는 조건문을 만듬
			if(item[i] == null) {		// 이를 통해 i의 최댓값까지 제품 가격의 합과 제품 리스트를 나열할 수 있다
				break;
				
			}
			
			sum += item[i].price;		// item[i]에 들어있는 제품의 price를 조회해서 sum에 더한다
			itemList += item[i] + ", ";
			// 마지막 콤마를 제거하는 법
			// itemList += (i==0) ? "" + item[i] : ", " + item[i];
			// i = 0일때만 콤마가 없이 출력되고, 그 이후부턴 , computer 이런식으로 출력되는것
		}
		
		System.out.println("구입하신 제품의 총액은 " + sum + "원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}
}
