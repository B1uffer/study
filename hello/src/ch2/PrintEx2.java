package ch2;

public class PrintEx2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;	//0.10, 1.0e-1
		float f2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d = %f%n", d);		//	%f는 소수점 6자리까지만 출력해서 반올림됨.
		System.out.printf("d=%14.10f%n", d);	//	%전체자리.소수점아래자리f 를 입력하면 원하는 자릿수까지 나올 수 있다. 빈자리는 0으로 채움 전체 14자리중 소수점 10자리까지
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);		// 문자열의 길이만큼만 출력공간을 확보함
		System.out.printf("[%20s]%n", url);		//	최소 20글자까지의 출력공간 확보. 그 외엔 공백(우측정렬)
		System.out.printf("[%-20s]%n", url);	//	최소 20글자까지. (좌측정렬)
		System.out.printf("[%.8s]%n", url);		//	왼쪽에서부터 8글자까지만
		
	}

}

