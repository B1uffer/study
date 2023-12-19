package 배열;

public class ex10_정렬하기 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false;		// 자리바꿈이 발생했는지에 대한 여부
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {	// numArr[j]가 numArr[j+1]보다 크다면
					int tmp = numArr[j];		// 값을 바꾸기 위한 tmp값을 생성해서
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;			// numArr[j]값과 numArr[j+1]값을 서로 바꾼다
					changed = true;				// 자리바꿈이 발생했으므로 true로 바꿔준다
				}
			}
			
			if(!changed) break;		// !changed는 false이므로 자리바꿈이 없다면 for문을 벗어난다
			
			for(int k=0; k<numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			
			System.out.println();
				// 이 정렬법을 버블 정렬(bubble sort)라고 한다.
		}
		

	}

}
