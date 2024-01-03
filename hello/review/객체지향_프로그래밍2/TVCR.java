package 객체지향_프로그래밍2;

public class TVCR extends Tv{		// TV 포함
	// 이게 예제 4임
	// TV, VCR 참조
	
	VCR vcr = new VCR();		// VCR 클래스를 포함시켜서 사용함
	
	// 자바는 다중상속을 허용하지 않기 때문에 Tv를 조상으로, VCR 클래스의 인스턴스를 만들어서 클래스에 포함시킴
	
	
	// VCR과 이름이 일치하는 선언을 하는 메서드들
	// 내부적으로는 VCR 클래스의 인스턴스를 생성해서 사용하는 것임
	// 이걸 이용해서 코드조작 같은걸 할 수도 있지 않을까?
	
	void play() {
		vcr.play();
		
	}
	
	void stop() {
		vcr.stop();
		
	}
	
	void rew() {
		vcr.rew();
		
	}
	
	void ff() {
		vcr.ff();
		
	}
	
	
	
}
