package 객체지향_프로그래밍2;

public class SCV extends GroundUnit implements Repairable {
	
	SCV() {
		super(60);
		hitPoint = MAX_HP;
		
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit3) {	// Repairable r과 Unit3의 인스턴스 타입이 같다면,
			Unit3 u = (Unit3) r;
			
			while(u.hitPoint != u.MAX_HP) {	// unit3의 hitPoint와 unit3의 MAX_HP가 다를 때
				
				u.hitPoint++;
				
			}
			
			System.out.println(u.toString() + "의 수리가 완료되었습니다.");
			
		} else if(r instanceof Building) {		// 또한 Repairable의 r과 Building의 인스턴스 타입이 같을 때
			
			Building b = (Building) r;		// Building 타입의 r을 참조하는 b 인스턴스를 생성하고
			
			while(b.hitPoint != b.MAX_HP) {		// 만약 b의 hitPoint와 b의 Max_Hp가 다르다면
				
				b.hitPoint++;			// 수리함
				
			}
			
			System.out.println(b.toString() + "의 수리가 완료되었습니다.");
			
		} else {		// 그 외엔
			System.out.println("수리할 수 없습니다.");		// 수리 불가
		}

	}

}
