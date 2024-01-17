package 객체지향_프로그래밍2;

public class Academy extends Building implements Repairable {
	
	Academy() {
		super(500);
		hitPoint = MAX_HP;
		
	}
	
	public String toString() {
		return "Academy";
		
	}
	

}
