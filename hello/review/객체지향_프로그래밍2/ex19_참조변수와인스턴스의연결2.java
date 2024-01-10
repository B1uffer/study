package 객체지향_프로그래밍2;

public class ex19_참조변수와인스턴스의연결2 {

	public static void main(String[] args) {
		
		Parent2 p = new Child4();
		Child4 c = new Child4();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		// child4 클래스에는 아무런 멤버도 정의되지 않았고 인스턴스 변수도 없다
		// child4는 단순히 parent2로부터 상속받았기 때문에 조상들의 멤버를 사용한다


	}

}
