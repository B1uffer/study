package 배열;

public class ex16_커맨드라인 {

	public static void main(String[] args) {
		
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i=0; i<args.length; i++) {
			
			System.out.println("args[" + i + "] = \" " + args[i] + " \" ");
		}

	}

}
