package 컬렉션_프레임워크;

import java.util.*;

public class ex22_HashSet3_Bingo {

	public static void main(String[] args) {
		
		// 1~50사이의 숫자 중 25개를 골라서 5x5크기의 빙고판을 만드는 예제
		
		Set set = new HashSet();
		//Set set = new LinkedHashSet();
		
		// List인터페이스를 구현한 컬렉션과는 다르게 HashSet은 저장순서를 유지하지 않는다
		// 따라서 저장순서를 유지하고자 한다면 HashSet을 만들고 LinkedHashSet()을 사용해야함
		
		// HashSet()의 경우 저장순서를 보장하지 않고 자체적인 저장방식에 의해 순서가 결정된다.
		// 따라서 HashSet()을 활용한 Math.random() 배열 순서는 HashSet()의 자체적인 저장방식에 따라 결정된다.
		// 더욱 무작위로 배열을 나열하고 싶다면 HashSet()보다 LinkedHashSet()이 더 나은 선택일 수 있다
		
		
		int[][] board = new int[5][5];
		
		for(int i=0; set.size() < 25; i++) {
			
			set.add((int)(Math.random()*50) + 1 + "");
			
		}
		
		
		Iterator it = set.iterator();
		
		for(int i=0; i < board.length; i++) {
			
			for(int j=0; j < board[i].length; j++) {
				
				board[i][j] = Integer.parseInt((String)it.next());		
				// next()는 반환값이 Object타입이기 때문에 형변환을 해줘야함
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
				
			}
			
			System.out.println();
			
		}
		

	}

}
