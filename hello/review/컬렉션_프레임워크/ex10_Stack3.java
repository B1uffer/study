package 컬렉션_프레임워크;

import java.util.*;

public class ex10_Stack3 {

	public static void main(String[] args) {
		
		// 괄호가 올바르게 박혀있는지 확인해주는 프로그램
		
		if(args.length!=1) {
			
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\", 병신아 너 잘못씀");
			System.out.println("Example : java ExpValidcheck \"((2+3)*1)+3\", 이렇게 적으셈 ㅋㅋ");
			System.exit(0);
			
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		System.out.println("expression.length() : " + expression.length());
		
		try {
			
			for(int i=0; i<expression.length(); i++) {		// 0~14
				
				char ch = expression.charAt(i);		// charAt() : 지정된 위치에 있는 문자를 알려준다
				
				if(ch=='(') {		// 반복문을 계속 조지다가 만약 ch가 expression.charAt()에 의해 (가 저장되었다면,
					
					st.push(ch+"");		// Stack 타입의 st 배열에다가 ( 를 저장한다
					
				} else if(ch==')') {		// 그리고 만약에 ch에 )가 저장되었다면,
					
					st.pop();		// st에 저장된 객체를 뽑아내는데, stack타입이므로 뒤에서부터 뽑아낸다.
					
				}
				
			}
			
			// 즉 이 반복문을 벗어났을 때 Stack타입의 st인스턴스 배열에 괄호 ( << 이게 남아있으면 아래 if문에서 조져짐
			
			if(st.isEmpty()) {
				
				System.out.println("괄호가 일치합니다.");
				
			} else {
				
				System.out.println("괄호가 일치하지 않습니다.");
				
			}
			
		} catch(EmptyStackException e) {		// 그 외 해괴한게 들어가 있으면 예외가 발생함
			
			System.out.println("괄호가 일치하지 않습니다.");
			
		}
		
	}

}
