package 객체지향_프로그래밍2;

public class ex13_접근제어자 {

	public static void main(String[] args) {
		// Time 참조
		
		Time t = new Time(12, 35, 30);		// 12시 35분 30초
		System.out.println(t);
		
		t.setHour(t.getHour() + 1);		// 현재 시간보다 1시간 뒤로 변경함
		System.out.println(t);

	}

}
