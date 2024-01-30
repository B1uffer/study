package 패키지;

public class ex05_toString2 {

	public static void main(String[] args) {
		
		String str = new String("Korea");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		
		System.out.println();
		
		System.out.println(today);
		System.out.println(today.toString());

	}
	
	
	/*
	 	String클래스의 str 인스턴스를 생성하고 Data 클래스의 today 인스턴스를 생성한 다음 toString()을 호출했더니,
	 		toString() 인스턴스를 생성하지 않았음에도 클래스 이름과 해시코드 대신 제대로 된 문자열이 출력되었다
	 		
	 	String 클래스의 경우 toString()은 String 인스턴스가 가지고 있는 문자열을 반환하도록 오버라이딩 되어있음
	 	Data 클래스의 경우 Data 인스턴스가 가지고 있는 날짜 및 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어있음
	 		따라서 String 클래스와 Data 클래스에 둘 다 toString()이 오버라이딩 되어있기 때문에 제대로 반환값이 나오는 것
	 		
	 
	  
	 
	 */
}
