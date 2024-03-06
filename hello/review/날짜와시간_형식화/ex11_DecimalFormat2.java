package 날짜와시간_형식화;

import java.text.*;

public class ex11_DecimalFormat2 {

	public static void main(String[] args) {
		
		// 패턴을 활용해서 숫자를 다르게 변환하는 예제
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			
			Number num = df1.parse("1,234,567.89"); 
			// parse() 메서드를 활용해 기호와 문자가 포함된 문자열을 숫자로 변환한다
			
			System.out.print("1,234,567.89" + " ->");
			
			double d = num.doubleValue();
			// Integer.parseInt()는 문자열을 숫자로 변환할 수 없기 때문에 double d = num.doubleValue()를 사용한다.
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));
			
		} catch(Exception e) {
			
			
			
		}

	}
	
	// parse(String source)는 DecimalFormat의 조상인 NumberFormat에 정의된 메서드이다.
	
	// public Number parse(String source) throws ParseException
	// 이게 parse(String source)
	
	// 여기서 Number 클래스는 Integer, Double과 같은 숫자를 저장하는 래퍼 클래스의 조상이다.
	// doubleValue()는 Number에 저장된 값을 double형으로 형변환하여 반환한다.
	// intValue(), floatValue()등 메서드가 Number클래스에 저장되어 있음

}
