package 객체지향_프로그래밍2;

public class Barrack extends Building implements Repairable, Liftable {
	
	Barrack() {
		super(1000);
		hitPoint = MAX_HP;
		
	}
	
	liftableImp l = new liftableImp();
	
	
    public void liftOff() {
    	l.liftOff();
    	
    }
	
	public void move(int x, int y) {
		l.move(x, y);
		
	}
	
	public void stop() {
		l.stop();
		
	}
	
	public void land() {
		l.land();
		
	}
	
	public String toString() {
		return "Barrack";
		
	}

}
