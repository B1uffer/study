package 배열;

public class ex04_System_arraycopy {

	public static void main(String[] args) {
		
		// for(int i=0; i<num.length; i++) { nextNum[i] = num[i];}
		// System.arraycopy(num, 0, newNum, 0, num.length);
		// 배열의 복사는 for문보다 System.arraycopy()를 활용하는 것이 효율적이다
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		System.out.println(abc.length);
		System.out.println(num.length);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만듬
		char[] result = new char[abc.length+num.length];
		System.out.println(result);
		System.out.println();
		
		System.arraycopy(abc, 0, result, 0, abc.length);	// abc[0]에서 result[0]으로 abc.length만큼 복사
		System.out.println(result);
		System.out.println();
		
		System.arraycopy(num, 0, result, abc.length, num.length);	// num[0]에서 result[abc.legnth=4]으로 num.length[10]만큼 복사
		System.out.println(result);
		System.out.println();
		
		// 배열 abc[0]에서 num[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.out.println();
		
		// number의 인덱스 6 위치에 3개를 복사함
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		

	}

}
