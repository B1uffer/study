package 변수;

public class ex15 {

	public static void main(String[] args) {
		
		int i = 91234567;
		float f = (float)i;		// int를 float로 형변환
		int i2 = (int)f;		// float를 int로 형변환
		
		double d = (double)i;	// int인 i를 double로 형변환
		int i3 = (int)i;		// double을 int로 형변환
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i = %d\n", i);
		System.out.printf("f = %f, i2 = %d\n", f, i2);	// f는 float, i2는 int
		System.out.printf("d = %f, i3 = %d\n", d, i3);	// d는 double, i3은 int
		System.out.printf("(int)%f = %d\n", f2, i4);	// f2는 float, i4는 int
		
	}

}
