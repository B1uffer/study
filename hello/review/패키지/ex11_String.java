package 패키지;

public class ex11_String {

	public static void main(String[] args) {
		
		String str1 = "str";
		String str2 = "str";
		
		System.out.println("String str1 = \"str\";");
		System.out.println("String str2 = \"str\";");
		
		System.out.println();
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		
		System.out.println();
		
		String str3 = new String("\"str\"");
		String str4 = new String("\"str\"");
		
		System.out.println("String str3 = new String(\"str\");");
		System.out.println("String str4 = new String(\"str\");");
		
		System.out.println();
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		
	}

}
