package ch5;

class Radio {

	int channel;
	boolean power;
	String color;
	String broadCastName;

	void channelup() {
		++channel;
	}

	void channeldown() {
		--channel;
	}

	void RadioOn() {
		power = true;
	}

	void RadioOff() {
		power = false;
	}

	void setBroadCastName() {
			
		int channel = 105;
		
		switch (channel) {

		case 106:
			broadCastName = "교양 음악방송";

		case 105:
			broadCastName = "MBC FM FOR YOU";

		default:
			broadCastName = "지정되지 않은 방송";

		}

	}

	// void 형식이고, 함수 이름은 printCurrentChannel. Syso을 이용해서 아래의 내용을 출력하면 됨.

	void printCurrentChannel() {

		System.out.println("현재 채널은" + channel + "," + broadCastName + " 입니다.");

	}

}

public class RadioTest {

	public static void main(String[] args) { // 너는 메서드야 병신아

		/**
		 * Radio r; // Radio 메서드를 사용하기 위한 참조변수 선언 r = new Radio(); // Radio 인스턴스(메서드
		 * 모음집) 생성
		 **/
		Radio r = new Radio(); // Radio 메서드를 사용하기 위한 참조변수 r 선언, Radio 인스턴스 생성

		if (r.power = true) {

			r.RadioOn();

		} else {

			r.RadioOff();

		}

		r.channel = 105;
		r.channelup();// 106

		r.setBroadCastName();
		r.printCurrentChannel();

		System.out.println();
		r.channeldown(); // 105

	}

}







Student getStudent(String name) {	 
										 
	Student s = new Student(name);	
	
	return s;
}