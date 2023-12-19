package 배열;

public class ex07_섞기 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];	// 비어있는 배열을 만듬
		
		for(int i=0; i<numArr.length; i++) {
			
			numArr[i] = i;		// 배열에 숫자를 저장함
			System.out.print(numArr[i]);
			
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);	// n은 0부터 9까지의 값을 무작위로 얻는다
			
			// numArr[0]과 numArr[n]의 값을 서로 바꿈
			int tmp = numArr[0];	// tmp값은 numArr[0] 값과 같다
			numArr[0] = numArr[n];	// numArr[0]값은 numArr[n]값과 같다
			numArr[n] = tmp;	// numArr[0] = tmp = numArr[n]
			
		}
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i]);		// Math.random()에 의해 실행할때마다 값이 달라진다
		}
	}

}
