package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		
			int year = 0;
			int age =  14;
			System.out.println(year);
			System.out.println(age);
		}
	}


class VarEx4	{
	public static void main(String[] args)	{
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + "y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("X:" + x + "Y:" + y);
		
	}
}

	// 카멜 방식
	// int carNumber
	
	// 파스칼 방식
	// int CarNumber
	
	// 스네이크 방식
	// int car_number
