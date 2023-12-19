package 객체지향_프로그래밍1;

public class ex4_객체배열 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];	// 길이가 3인 Tv객체 배열
		
		// Tv 객체를 생성해서 Tv객체 배열의 각 요소에 저장하는것이다
		for(int i=0; i<tvArr.length; i++) {	// tvArr.length는 3 (0, 1, 2)
			tvArr[i] = new Tv();	//tvArr[0] = new Tv(); 이런식임
			tvArr[i].channel = i+10;	// tvArr[0].channel = 0 + 10 = 10
			
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelup();	// Tv객체에서 channelup() 메서드를 불러왔다 ++channel
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
			
		}

	}

}
