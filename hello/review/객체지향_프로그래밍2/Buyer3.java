package 객체지향_프로그래밍2;

import java.util.*;		// Vector 클래스 이용을 위해

public class Buyer3 {		// 고객
	
	int money = 1000;		// 보유금액
	int bonusPoint = 0;		// 보유포인트
	Vector item = new Vector();		// 구매한 제품을 저장하는 데 사용될 Vector 객체. 배열임
	
	
	void buy(Product3 p) {		// 구매하는 메서드
		if(money < p.price) {		// 만약 잔액이 모자라다면,
			System.out.println("잔액이 모자랍니다.");
			return;		// 반환한다
		}
			// if문을 통과했다면, 물건을 구매한다.
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);		// 구입한 제품을 Vector 배열에 저장한다
		System.out.println("제품" + p + "를(을) 구매하셨습니다. 감사합니다!");
	}
	
	
	void refund(Product3 p) {		// 환불하는 메서드
		if(item.remove(p)) {		// item.remove() 메서드를 통해 vector 배열에서 제품을 제거했을 경우
			money += p.price;
			bonusPoint -= p.bonusPoint;		// 포인트와 제품을 환불해줌
			System.out.println("정상적으로 환불이 완료되었습니다.");
			
		} else {		// 환불에 실패했을 경우
			System.out.println("구입하신 제품 중 해당하는 제품이 없습니다.");
		}
		
	}
	
	
	void summary() {		// 구매한 제품의 정보를 보여주는 메서드
		int sum = 0;		// 제품들의 가격 총액을 여기에 넣는다
		String itemList = "";	// 물품 목록을 보여주게끔 한다
		
		if(item.isEmpty()) {		// item.isEmpty라는 Vector 배열이 비어있는지 확인하는 명령어
			System.out.println("구매하신 제품이 없습니다.");
			return;
			
		}
		
		// 구매한 제품의 총 가격과 리스트를 만드는 조건문
		for(int i=0; i<item.size(); i++) {		// Vector의 크기는 변수.size로 알 수 있음
			Product3 p = (Product3)item.get(i);		// item.get(i)는 i번째 객체를 얻어오는 것
			sum += p.price;		// sum에 제품의 가격을 더한다 그걸 i번 실행
			itemList += (i==0) ? "" + p : ", " + p;	// itemList에 제품의 이름을 나열한다 마찬가지로 i번
			
		}
		
		System.out.println("구매하신 제품들의 총액은 " + sum + "원 입니다.");
		System.out.println("구매하신 제품들은 " + itemList + " 입니다.");
	}
}
