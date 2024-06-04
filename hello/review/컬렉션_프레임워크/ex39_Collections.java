package 컬렉션_프레임워크;

import java.util.*;
import static java.util.Collections.*; // 요게 static Collections?

public class ex39_Collections {

	public static void main(String[] args) {

		// 정처기 공부중
		// zz

		// List list = new ArrayList();

		// int a = 0, hap = 0;

		/** for (int i = 0; i <= 5; i++) {

			hap += i;

			System.out.println(hap);

		} **/

		int cnt = 0;

		do {

			cnt++;

		} while (cnt < 0);

		if (cnt == 1) {

			cnt++;

		} else {

			cnt = cnt + 3;

			System.out.printf("cnt : %d", cnt);

		}
		
		System.out.printf("cnt : %d%n", cnt);

	}

}
