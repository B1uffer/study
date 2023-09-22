package ch2;						// 정수형간의 형변환 방법

public class CastingEx2 {

	public static void main(String[] args) {
		
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int - > byte] i = %d - > b = %d%n", i, b);		// 정수형 int로 지정된 i를 byte b에 치환했을 때 값을 출력하려면 i를 byte값으로 지정해줘야함.
																			// 4byte인 int타입을 ibyte인 byte타입으로 바꿔주는 과정에서 10은 00001010에서 한칸당 1bit니까 8bit = 1byte이기 때문에 값손실이 없음
		i = 300;
		b = (byte)i;
		System.out.printf("[int - > byte] i = %d - > b = %d%n", i, b);		// 300을 2진수로 표현하면 1,00101100 즉 9자리가 된다. int타입은 4byte라서 표현이 가능하지만 byte는 1byte이기 때문에 8자리까지 표현할 수 없음
																			// 즉 좌측에서 한줄이 잘린 00101100이 되며 44라는 수가 나오게 됨
	
		b = 10;
		i = (int)b;
		System.out.printf("[byte - > int] b = %d - > i = %d%n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte - > int] b = %d - > i = %d%n", b, i);
		
		
		System.out.println("i = " + i);
		System.out.println("i = " + Integer.toBinaryString(i));				// 2의 보수법에 의해 int인 i의 2진법값은 크게 나온다
		
	
	}

}
