package 패키지;

// import static java.lang.Math.*;

import java.math.*;

public class MathTest {
	
	public static void main(String[] args) throws Exception {
		
		// static double abs(double a)
		// staitc float abs(float f)
		// static int abs(int f)
		// static long abs(long f) : 주어진 값의 절대값을 반환하다.
				
		double d1 = Math.abs(-10.0);
		System.out.println(d1);
		int i1 = Math.abs(-10);
		System.out.println(i1);
		float f1 = Math.abs(-10.0f);
		System.out.println(f1);
		long l1 = Math.abs(10L);		// 잊지말자 long은 short랑 int와 같은 정수형이다
		System.out.println(l1);
		System.out.println();
		
		// static double ceil(double a) : 주어진 값을 '올림'하여 반환한다.
		double d2 = Math.ceil(10.1);
		System.out.println(d2);
		double d3 = Math.ceil(-10.3);
		System.out.println(d3);
		double d4 = Math.ceil(10.00005);
		System.out.println(d4);
		System.out.println();
		
		// static double floor(double a) : 주어진 값을 버림하여 반환한다
		double d5 = Math.floor(10.8);
		System.out.println(d5);
		double d6 = Math.floor(-10.8);
		System.out.println(d6);
		System.out.println();
		
		// static double max(double a, double b)
		// static float max(float a, float b)
		// static int max(int a, int b)
		// static long max(long a, long b) : 주어진 두 값을 비교하여 큰 쪽을 반환함
		
		double d7 = Math.max(9.5, 9.50001);
		System.out.println(d7);
		int i2 = Math.max(0, -1);
		System.out.println(i2);
		System.out.println();
		
		// static double min(doubla a, double b)
		// static float min(float a, float b)
		// static int min(int a, int b)
		// static long min(long a, long b) : 주어진 두 값을 비교하여 작은 쪽을 반환함
		
		double d8 = Math.min(9.5, 9.500001);
		System.out.println(d8);
		int i3 = Math.min(0, 1);
		System.out.println(i3);
		System.out.println();
		
		
		// static double random() : 0.0 ~ 1.0 범위의 임의의 double값을 반환함. (start ~ end처럼 1.0은 포함되지 않는다)
		double d9 = Math.random();
		System.out.println(d9);
		int i4 = (int)(Math.random()*10) + 1;		
		// 0~10 사이의 범위이기 때문에 10은 포함이 되지 않는다. 따라서 뒤에 +1을 해줌으로서 0~9를 1~10으로 만듦
		System.out.println(i4);
		System.out.println();
		
		// static double rint(double a) : 주어진 double값과 가장 가까운 정수값을 double형으로 반환함.
		// 단, 두 정수의 정가운데 있는 값의 경우 짝수를 반환.(1.5, 2.5, 3.5)
		double d10 = Math.rint(1.2);		// rint()라고 해서 전부 짝수형을 반환하는 것은 아니다.
		System.out.println(d10);
		double d11 = Math.rint(2.6);
		System.out.println(d11);
		double d12 = Math.rint(3.5);
		System.out.println(d12);
		double d13 = Math.rint(4.5);
		System.out.println(d13);
		System.out.println();
		
		// static long round(double a)		얘는 매개변수가 double
		// static long round(float a)		얘는 매개변수가 float
		// : 소수점 첫 번째 자리에서 반올림한 '정수값(long값)'을 반환함.
		// 매개변수의 값이 음수인 경우, round()와 rint()의 결과가 다르다!!!!!
		long l2 = Math.round(1.2);
		System.out.println(l2);
		long l3 = Math.round(2.6);
		System.out.println(l3);
		long l4 = Math.round(3.5);
		System.out.println(l4);
		long l5 = Math.round(4.5);
		System.out.println(l5);
		double d14 = 90.7552;
		double d15 = Math.round(d14*100)/100.0;		// 9076 / 100
		System.out.println(d15);
		
		System.out.println();
		
		BigDecimal val = new BigDecimal(1.0e-22);
		System.out.println(val.toPlainString());
		System.out.println(val.toString());
		
		System.out.println();
		
		BigDecimal val2 = new BigDecimal(3.141592);
		System.out.println(val2.toPlainString());
		System.out.println(val2.toString());
		
		System.out.println();
		
		BigDecimal bd1 = new BigDecimal("123.456");
		System.out.println(bd1);
		System.out.println(bd1.scale());
		System.out.println(bd1.unscaledValue());
		System.out.println(bd1.precision());
		System.out.println();
		
		BigDecimal bd2 = new BigDecimal("1.0");
		System.out.println(bd2);
		System.out.println(bd2.scale());
		System.out.println(bd2.unscaledValue());
		System.out.println(bd2.precision());
		System.out.println();
		
		BigDecimal bd3 = bd2.multiply(bd1);
		System.out.println(bd3);
		System.out.println(bd3.scale());
		System.out.println(bd3.unscaledValue());
		System.out.println(bd3.precision());
		System.out.println();
		
		BigDecimal bigd = new BigDecimal("1.0");
		BigDecimal bigd2 = new BigDecimal("3.0");
		// System.out.println(bigd.divide(bigd2)); java.lang.ArithmeticException이 발생한다
		System.out.println(bigd.divide(bigd2, 3, RoundingMode.HALF_UP));		// 5 이상에서 반올림, 5 미만에서 내림
		System.out.println();
		
		BigDecimal bd4 = new BigDecimal("123.456");
		BigDecimal bd5 = new BigDecimal("1.0");
		System.out.println(bd4.divide(bd5, 2, RoundingMode.HALF_UP));
		System.out.println(bd4.divide(bd5, new MathContext(2, RoundingMode.HALF_UP)));
		// MathContext()는 정수와 소수점 이하를 모두 포함한 자릿수를 의미한다
		
		
	}
}
