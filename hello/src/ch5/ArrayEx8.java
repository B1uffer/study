package ch5;						// 값을 서로 바꾸기

public class ArrayEx8 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];		// 45개의 정수값을 저장하기 위한 배열 생성
		
		for(int i=0; i < ball.length; i++)	{
			
			ball[i] = i + 1;		// ball[0]에는 1이 저장되며 ball[44]에는 45가 저장된다
			
		}
		
		int temp = 0;				// 바꾸기에 사용할 임시변수
		int j = 0;					// 값을 얻어서 저장하는 변수
		
		for(int i=0; i < 6; i++)	{
			
			j = (int)(Math.random() * 45);	// j는 0~44에서 임의로 값을 가짐
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;					// 바뀜
		}
		
		for(int i=0; i < 6; i++)	{				// 배열 ball 앞에서부터 6개의 요소를 출력함
			
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
			
		}

	}

}
