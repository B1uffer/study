package 객체지향_프로그래밍1;

public class ex14_참조형반환타입 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);		// copy라는 새로운 메서드
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		

	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
	
}
