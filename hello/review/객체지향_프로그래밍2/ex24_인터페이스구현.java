package 객체지향_프로그래밍2;

public class ex24_인터페이스구현 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		
		if(f instanceof unit2) {
			System.out.println("Fighter는 unit2를 제대로 상속받았습니다.");
			
		}
		
		if(f instanceof Fightable) {
			System.out.println("Fighter는 싸울 수 있습니다.");
			
		}
		
		if(f instanceof Movable) {
			System.out.println("Fighter는 또한 움직일 수 있는 상태입니다.");
			
		}
		
		if(f instanceof Attackable) {
			System.out.println("Fighter는 전투 상태에서 공격할 수 있습니다.");
		
		}
		
		if(f instanceof Object) {
			System.out.println("Fighter는 Object들의 기능을 사용할 수 있습니다.");
		}

	}

}
