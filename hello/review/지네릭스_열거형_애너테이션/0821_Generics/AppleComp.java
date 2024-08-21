package gene;

import java.util.*;

public class AppleComp implements Comparator<Apple02>{
	
	public int compare(Apple02 t1, Apple02 t2) {
		
		return t2.weight - t1.weight;
		
	}
	
}
