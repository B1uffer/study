package gene;

import java.util.ArrayList;

public class ex02_Generics02 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Grape> grapeBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		
		// FruitBox<Toy> toyBox = new FruitBox<Toy>(); 불가능
		// FruitBox<Grape> anyBox = new FruitBox<Apple>(); 불가능
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		System.out.println(fruitBox);
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		// grapeBox.add(new Apple()); Apple은 Grape의 자손이 아니기 때문에 add할 수 없음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}
