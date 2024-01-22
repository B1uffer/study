package 객체지향_프로그래밍2;

import java.awt.*;

import java.awt.event.*;


class ex37_익명클래스2 {
	public static void main(String[] args) {
	
		// 익명 클래스로 변환하는 예?
		
		
		Button b = new Button("start");
		b.addActionListener((ActionListener) new EventHandler());
		
	}
	
}
