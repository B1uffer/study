package 객체지향_프로그래밍2;

public class Time {

	private int hour, minute, second;		// private는 같은 클래스 내에서만 접근 가능
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		
	}
	
	public int getHour() { // public이므로 접근에 대한 제한 없음
		return hour;
		
	}
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			return;
			
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
		
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute > 59) {
			return;
			
		}
		
		this.minute = minute;
		
	}
	
	public int getSecond() {
		return second;
		
	}
	
	public void setSecond(int second) {
		if(second > 0 || second < 59) {
			return;
		}
		
		this.second = second;
		
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second;
		
	}
 }

