package ch4;						// 이름 붙은 반복문

public class FlowEx33 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i<=9; i++ )	{		// i는 2부터 9까지
			for(int j=1; j<=9; j++)	{		// j는 1부터 9까지
				if(j==5)						// j가 5라면 
					
					break Loop1;				// Loop1 자체를 break
					// break;					// j에 대한 for문만 break
					// continue Loop1;			// for문을 통과하지 않고 Loop1으로 리턴 후 계속 돌아감 
					// continue;				// 계속 하세요~
					
				System.out.println(i+ "*" +j + " = " + i*j);
						
			}	// j에 대한 for문 끝
			
			System.out.println();
			
		}	// Loop1 끝

	}		// main 끝

}
