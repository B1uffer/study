package ch2;

public class StringEx {

	public static void main(String[] args) {
		
				String name = "Ja" + "va";
				String str = name + 8.0;
				
				System.out.println(name);
				System.out.println(str);
				System.out.println(7 + " ");
				System.out.println(" " + 7);
				System.out.println(7 + "");		//7과 같은 기본형 타입의 값을 문자열로 변환할 땐 ""을 더해주면 됨
				System.out.println("" + 7);
				System.out.println("" + "");		//빈칸이 나옴
				System.out.println(7 + 7 + "");		//14가 나옴
				System.out.println("" + 7 + 7);		// 기본형이 문자형으로 바뀌어서 77이 됨

	}

}
