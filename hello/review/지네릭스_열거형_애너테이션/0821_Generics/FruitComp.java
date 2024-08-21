package gene;

import java.util.*;

public class FruitComp implements Comparator<Fruit02>{
	
	public int compare(Fruit02 t1, Fruit02 t2) {
		
		return t1.weight - t2.weight;
		
	}
	
}
