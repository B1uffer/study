package gene;

import java.util.*;

public class GrapeComp implements Comparator<Grape02>{
	
	public int compare(Grape02 t1, Grape02 t2) {
		
		return t2.weight - t1.weight;
		
	}
	
}
