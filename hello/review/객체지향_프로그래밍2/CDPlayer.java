package 객체지향_프로그래밍2;

class CDPlayer extends Player {		// Player를 상속받은 CD플레이어
	
	void play(int currentPos) {
		// 조상 클래스의 추상메서드 구현부
	}
	
	void stop() {
		// 조상 클래스의 추상메서드 구현부
	}
	
	int currentTrack;		// 현재 실행되고 있는 트랙을 초기화하는 변수
	
	void nextTrack() {		// 다음트랙
		currentTrack++;
		
	}
	
	void preTrack() {		// 이전트랙
		if(currentTrack > 1) {		
			// currentTrack이 1보다 크다면, 즉 currentTrack이 1번 이하일 땐 조건문이 실행되지 않는다
			currentTrack--;
			
		}
	}

}
