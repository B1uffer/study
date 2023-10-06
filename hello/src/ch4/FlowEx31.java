package ch4; 					// continue문

public class FlowEx31 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			if (i % 3 == 0)

				continue; // 조건식이 참이 되어 continue가 수행되면 블럭의 끝으로 이동함

			System.out.println(i);

		} // 여기로 이동함. 위의 출력문을 넘겨뛴다는 의미

	}

}
