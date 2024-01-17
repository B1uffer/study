package 객체지향_프로그래밍2;

public class Factory extends Building implements Repairable, Liftable {
	
	Factory() {
		super(1250);
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
		return "Factory";
		
	}

}
