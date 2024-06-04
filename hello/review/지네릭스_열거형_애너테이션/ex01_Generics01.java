package 지네릭스_열거형_애너테이션;

import java.util.ArrayList;

public class ex01_Generics01 {

	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());		// fruitBox의 지네릭은 <Fruit>이고 Apple은 Fruit를 상속하고 있으니 가능
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		// appleBox.add(new Toy()); 얘는 안됨 Toy는 Fruit을 상속하고 있지 않아서
		
		toyBox.add(new Toy());
		// toyBox.add(new Apple()); toyBox 인스턴스는 지네릭이 <Toy>로 되어있으니 Toy 타입만 넣을 수 있음 따라서 Apple은 불가능
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		System.out.println();
		
		appleBox.add(new Apple());
		System.out.println(appleBox);
		
	}

}
