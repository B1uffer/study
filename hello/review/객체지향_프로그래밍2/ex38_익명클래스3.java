package 객체지향_프로그래밍2;

import java.awt.*;
import java.awt.event.*;

public class ex38_익명클래스3 {

	public static void main(String[] args) {

		// ex37과 비교해가면서 보기

		Button b = new Button("start");
		b.addActionListener(new ActionListener() {		// new ActionListener() 부터 익명 클래스의 시작
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred");
			}
		}		// 여기까지가 익명 클래스의 끝

		);

	}

}
