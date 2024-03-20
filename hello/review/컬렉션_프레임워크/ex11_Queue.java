package 컬렉션_프레임워크;

import java.util.*;

public class ex11_Queue {

	// 유닉스의 history 명령어를 Queue를 이용해서 구현한 것
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue 타입의 q 인스턴스의 최대 배열을 5로 하게끔 하는 객체

	public static void main(String[] args) {

		System.out.println("자 병신아 모르겠으면 'help'를 입력해서 도움말을 확인해보세요~");

		while (true) {

			System.out.print(">>");

			try {

				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // String trim() : 문자열 왼쪽과 오른쪽의 공백을 없앤 값을 반환한다

				if ("".equals(input)) {

					continue;

				}

				if (input.equalsIgnoreCase("q")) {
					// boolean equalsIgnoreCase() : 문자열과 String 문자열을 대소문자 구분없이 비교함

					System.exit(0);

				} else if (input.equalsIgnoreCase("help")) {

					System.out.println("help : 도움말을 보여줌");
					System.out.println("q 또는 Q : 프로그램을 종료함");
					System.out.println("history : 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줌");

				} else if (input.equalsIgnoreCase("history")) {
					
					int i = 0;
					
					save(input);		// input에 입력받은 명령어를 저장한다
					System.out.println(input);
					
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {		
						// hasNext() : Iterator 인터페이스를 공부할때 나온다
						// boolean hasNext() : 다음에 가져올 값이 있으면 true
						// 매개변수 혹은 iterator next() : 어떤 타입으로도 반환이 됨
						
						System.out.println(++i + "." + it.next());
						
						
					}
					
				} else {		// 위 3가지 명령어를 제외하고 나머지 개같은 소리를 작성하면
					
					save(input);		// save 메서드에 input을 매개변수로 넣고
					System.out.println(input);		// 출력함
					
				}

			} catch (Exception e) {

				System.out.println("입력 잘못함 ㅠ_ㅠ");

			}

		}
	}
	
	public static void save(String input) {
		
		if(!"".equals(input)) {		// 입력받은 input이 공백이 아니라면
			
			q.offer(input);		// Queue타입의 q 인스턴스 배열에 객체를 저장한다
			
		}
		
		if(q.size() > MAX_SIZE) {		// size()는 Collection 인터페이스에 정의되어 있다
							// Queue 타입의 q 인스턴스의 배열 크기가 MAX_SIZE보다 크다면,
			q.remove();		// remove()는 객체를 꺼내서 반환한다
			
		}
		
	}
	
}
