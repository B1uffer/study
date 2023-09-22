/** 변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는 것이다. **/
/** 변수에 값을 저장할 대는 대입 연산자 '=' 을 이용함. int age = 25; **/
/** 점(.)은 ~~ 안에 라는 뜻이다 **/

package ch2;

public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;	//	변수 age의 값에 2000을 더해서 변수 year에 저장
		age = age + 1;		//	변수 age에 저장된 값을 1 증가시킨다.
		
		System.out.println(year);	//	화면에 글자를 출력하려면 println()을 사용함
		System.out.println(age);
		
		a1 ex2 = new a1();
		System.out.println(ex2.x);
		
		// x = y에서 이 식의 연산은 우변(y)의 모든 계산이 끝난 후에 대입연산(=)이 실행된다.
		// int x = 10 / int y = 20 일 때, x = y이면 y의 값이 x에 저장되고 대입하므로 x = 20, y = 20이 됨.
		

	}

}

class a1 {

	public int a;
	public int b;
	int x = 0;
	int y = 0;

}

class VarEx3 {

	int a, b;
	int x = 0, y = 0;

}