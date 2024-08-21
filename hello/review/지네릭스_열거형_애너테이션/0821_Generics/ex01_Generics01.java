package gene;

import java.util.ArrayList;

public class ex01_Generics01 {

	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		// Box<Grape> grapeBox = new Box<Apple>(); 은 타입 불일치로 안됨
		
		fruitBox.add(new Fruit());
		System.out.println(fruitBox);
		
		fruitBox.add(new Apple());		// Apple extends Fruit
		System.out.println(fruitBox);
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		// appleBox.add(new Toy()); Fruit의 확장이 아님
		
		System.out.println(appleBox);
	}

}
