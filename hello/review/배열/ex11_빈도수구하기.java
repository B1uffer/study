package 배열;

public class ex11_빈도수구하기 {

	public static void main(String[] args) {
		
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			
			counter[numArr[i]]++;
			
		}
		// counter[]++에 대해서
		// counter[numArr[i]]++ : i에 대한 numArr값을 가지는 int[] counter = new int[10];
		// counter[numArr[0]]++ : 만약 i가 0이었을 때, numArr[i] = (int)(Math.random() * 10)이므로
		// counter[numArr[0]]++에서 numArr[0]은 무작위로 정해질 수 있다. 4라고 가정하자. numArr[0] = 4
		// 그렇다면 counter[4]가 된다. 여기에서 counter[4]++라는 것은 counter[4]의 값을 1 증가시킨다는 의미임
		// 즉 counter[] = {0, 0, 0, 1, 0, 0, 0, 0, 0, 0}; 이 되어있다.
		
		for(int i=0; i<numArr.length; i++) {
			
			System.out.println(i + "의 갯수 : " + counter[i]);
		}
	}

}
