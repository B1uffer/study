package gene;

import java.util.*;

public class ex04_Generics04 {

	public static void main(String[] args) {
		
		FruitBox02<Apple02> appleBox = new FruitBox02<Apple02>();
		FruitBox02<Grape02> grapeBox = new FruitBox02<Grape02>();
		
		appleBox.add(new Apple02("GreenApple", 300));
		// super(name, weight) - > Fruit02(String name, int weight)
		appleBox.add(new Apple02("GreenApple", 100));
		appleBox.add(new Apple02("GreenApple", 200));
		
		grapeBox.add(new Grape02("GreenGrape", 400));
		grapeBox.add(new Grape02("GreenGrape", 300));
		grapeBox.add(new Grape02("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		// sort 정렬기준으로 정렬함
		System.out.println(appleBox);
		
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(grapeBox);

		System.out.println();
		
		Collections.sort(appleBox.getList(), new FruitComp());
		System.out.println(appleBox);
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(grapeBox);
		
	}

}
