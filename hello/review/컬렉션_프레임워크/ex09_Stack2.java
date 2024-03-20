package 컬렉션_프레임워크;

import java.util.*;

public class ex09_Stack2 {
	
	// 웹브라우저의 뒤로, 앞으로를 Stack을 활용해서 구현한 것
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		
		printStatus();
		
		goBack();
		printStatus();
		
		goBack();
		printStatus();
		
		goForward();
		printStatus();
		
		
		goURL("5.디시인사이드");
		printStatus();
		
		
		goBack();
		printStatus();
		
		
		goBack();
		printStatus();
		
		
		goBack();
		printStatus();
		
		
		goForward();
		printStatus();
		
		
		goBack();
		printStatus();
		
		
		goURL("https://chzzk.naver.com/");
		printStatus();
		
		
		goURL("https://mabinogi.nexon.com/");
		printStatus();
		
		
		goURL("https://asgard.nexon.com/");
		printStatus();
		
		
		goURL("https://chzzk.naver.com/a77f4030b13ca02a3672e8046144e5cd/");
		printStatus();
	
		
		goBack();
		printStatus();
	
		
		goBack();
		printStatus();

		
		goBack();
		printStatus();
		
		goForward();
		printStatus();
		
		goForward();
		printStatus();
		
		goForward();
		printStatus();
		
	}
	
	
	
	public static void printStatus() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
		
	}
	
	public static void goURL(String url) {
		
		back.push(url);
		
		if(!forward.empty()) {		// 비어있지 않다면
			
			forward.clear();		// forward 배열을 싹 다 모조리 몽땅 비운다
			
		}
		
	}
	
	public static void goForward() {
		
		if(!forward.empty()) {
			
			back.push(forward.pop());
			// 얘도 마찬가지로 forward 인스턴스인데, Stack 배열 타입이니까 pop()으로 맨 뒤에 있는걸 뽑은 다음 
			// back 인스턴스(Stack타입)의 맨 뒤 배열에 저장한다.
			// 따라서 forward 배열 맨 뒤에 한 줄이 사라지고, back 맨 뒤에 한 줄이 추가가 된다.
			
		}
		
	}
	
	public static void goBack() {
		
		if(!back.empty()) {
			
			forward.push(back.pop());		
			// pop()은 객체를 꺼낸다, 즉 기존 Stack의 맨 뒤에 있는 객체를 지우는 것과 같게 됨
			// push()는 push() 괄호 안에 있는 매개변수를 stack에 저장한다.
			
			// 그럼 저 코드forward.push(back.pop()); 가 대체 뭔 말이냐?
			// 우선 back이라는 인스턴스에 대해 Stack 배열 타입이므로 맨 뒤에 존재하는 객체를 뽑아낸다.
			// 그리고 forward라는 인스턴스에 대해 마찬가지로 Stack 배열 타입이므로 맨 뒤부터 객체를 저장하는데, 
			// 그게 Back 인스턴스에서 pop()메서드를 통해 뽑아낸 배열이다.
			
		}
		
	}
	
}
