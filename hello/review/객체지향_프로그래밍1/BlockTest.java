package 객체지향_프로그래밍1;

public class BlockTest {

	static {
		System.out.println("static { }");
		
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
		
	}
}
