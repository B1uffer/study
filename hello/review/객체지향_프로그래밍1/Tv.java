package 객체지향_프로그래밍1;

class Tv {

		// TV의 속성(멤버변수)
		String color;	// TV는 색상도 있을것이고..
		boolean power;	// 전원도 있을것이고..
		int channel;	// 채널도 있겠지 1번 2번 11번 이렇게
		
		// TV의 기능(메서드)
		void color() {
			power = !power;
			
		}
		
		void channelup() {
			++channel;
			
		}
		
		void channeldown() {
			--channel;
			
		}
	


	
}
