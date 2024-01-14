package 객체지향_프로그래밍2;

public class TVCR2 extends Tv4 implements IVCR {
	
	// 다중상속의 경우 두 클래스 이상을 상속받고 싶을 경우
	// 한쪽만 상속받고 나머지 한 쪽은 클래스 내에 포함시켜서 내부적으로 인스턴스를 생성 후 사용함
	
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
