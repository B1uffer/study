package 객체지향_프로그래밍1;

class StaticBlockTest {
	
static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장함
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
}

public class ex28_초기화블럭2 {

	
	public static void main(String[] args) {
		
		StaticBlockTest s = new StaticBlockTest();
		
		for(int i=0; i<s.arr.length; i++) {
			System.out.println("arr["+ i +"] : " + s.arr[i]);
		}

	}

}
