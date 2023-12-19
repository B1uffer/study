package 배열;

public class ex08_섞기 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];	// 45개의 빈 공간을 생성한다
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
			System.out.print(ball[i]);
		}
		
		System.out.println();
		
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);	// j는 0부터 44까지 임의의 값으로 정해진다
			
			temp = ball[i];		
			ball[i] = ball[j];	// 임의의 값으로 정해지는 j를 ball[]에 넣으면 ball[j]는 랜덤하게 변한다
			ball[j] = temp;		// ball[i]와 ball[j]의 값을 서로 바꾼다
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
		
		

	}

}
