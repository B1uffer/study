package 배열;

public class ex13_16진수를_2진수로_변환하는_예제 {

	public static void main(String[] args) {
		
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		
		String result = " ";
		
		
		for(int i=0; i<hex.length; i++) {
			
			if(hex[i] >='0' && hex[i] <='9') {
				
				result += binary[hex[i]-'0'];
			} else {
				result += binary[hex[i] - 'A' +10];
				
			}
				
		}
		
		System.out.println("hex : " + new String(hex));		// new String(hex)는 char[] hex를 String으로 출력하는것
		System.out.println("binary : " + result);

	}

}
