package 객체지향_프로그래밍2;

public class TVCR2 extends Tv4 implements IVCR {
	
	VCR2 vcr = new VCR2();
	
	public void play() {
		
	}
	
	public void stop() {
		
	}
	
	public void reset() {
		
	}
	
	public int getCounter() {
		
		return vcr.getCounter();
		
	}
	
	public void setCounter(int c) {
		
		vcr.setCounter(c);
		
	}

}
