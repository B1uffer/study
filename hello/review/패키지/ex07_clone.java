package 패키지;

public class ex07_clone {

	public static void main(String[] args) {
		
		Point original = new Point(3, 5);
		
		Point copy = (Point)original.clone();		// clone()을 통해 새로운 객체를 생성함
		
		System.out.println(original);
		System.out.println(copy);
	}

}
