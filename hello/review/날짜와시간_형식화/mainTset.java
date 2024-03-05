package 날짜와시간_형식화;

public class mainTset {

	public static void main(String[] args) {
		
		// 프로그램을 실행할 때 2개의 문자열을 주지 않으면 강제 종료, 2개의 문자열이 주어지면 int로 바꾸어 덧셈을 수행하는 예제
		
		if(args.length != 2) {
			
			System.out.println("\t프로그램 사용법을 꼭 읽어보세요.");
			System.out.println();
			System.out.println("\t대충 프로그램 사용법");
			System.out.println("\t1. 좌측 상단에서 Run을 찾으세요");
			System.out.println("\t2. Run Configurations을 찾으세요");
			System.out.println("\t3. 좌측에서 해당 클래스를 검색 후, 우측에서 Arguments를 찾으세요");
			System.out.println("\t4. Program arguments 박스에 원하는 매개값이나 매개변수 타입에 알맞는 값을 입력하세요.");
			System.exit(0);		// 강제종료
			
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		System.out.println("result : " + result);
	}

}
