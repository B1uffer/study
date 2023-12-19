package 변수;

public class ex3 {

	public static void main(String[] args) {
		
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");		// 14 + "" = 14
		System.out.println("" + 7 + 7);		//	"" + 7이 먼저 되어 "7" + 7 = 77
		

	}

}
