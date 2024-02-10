package 패키지;

public class ex16_String을_기본형으로 {

	public static void main(String[] args) {
		
		// 문자열과 기본형간의 변환
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);		// int를 String으로 변환. String 변환법 1
		
		double dVal = 200.0;
		String strVal2 = dVal + "";		// double을 String으로 변환. String으로 변환법 2
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		// parseInt(), parseDouble(), parseFloat() 같은 메서드는 문자열에 공백 또는 문자가 포함되어있을 경우
		// NumberFormatException 예외가 발생할 수 있으므로 주의
		// 그래서 문자열 양 끝의 공백을 제거해주는 trim()을 습관적으로 함께 사용할 수 있다
		
		// int val = Integer.parseInt(" 123 ".trim()); 에서 trim()은 문자열 양 끝의 공백을 제거하는 메서드
		
		
		System.out.println(String.join("", strVal,"+",strVal2,"=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	
	}

}
