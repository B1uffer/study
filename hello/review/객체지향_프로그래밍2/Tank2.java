package 객체지향_프로그래밍2;

public class Tank2 extends GroundUnit implements Repairable {
	
	Tank2() {
		
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
		
	}

}
