package 컬렉션_프레임워크;

import java.util.*;

public class ex25_HashSet6 {

	public static void main(String[] args) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");	setA.add("2");	setA.add("3");	setA.add("4");	setA.add("5");
		System.out.println("A : " + setA);
		
		setB.add("4");	setB.add("5");	setB.add("6");	setB.add("7");	setB.add("8");
		System.out.println("B : " + setB);
		
		Iterator it = setB.iterator();
		
		System.out.println("Iterator it을 출력해보면 : " + it);
		System.out.println();
		
		
		while(it.hasNext()) {
			
			Object tmp = it.next();
			
			if(setA.contains(tmp)) {
				
				setKyo.add(tmp);
				
			}
		}
		
		System.out.println("setKyo : " + setKyo);
		
		it = setA.iterator();
		// iterator()는 재사용할 수 없으므로 hasNext() - > next() 이후 반드시 다시 얻어와야한다
		
		while(it.hasNext()) {
			
			Object tmp = it.next();
			
			if(!setB.contains(tmp)) {
				
				setCha.add(tmp);
				
			}
			
		}
		
		System.out.println("setCha : " + setCha);
		
		it = setA.iterator();
		// 재사용
		
		while(it.hasNext()) {
			
			setHab.add(it.next());
			
		}
		
		System.out.println("setHab : " + setHab);
		
		it = setB.iterator();
		
		while(it.hasNext()) {
			
			setHab.add(it.next());
			
		}
		
		System.out.println("setHab : " + setHab);
		
		// 오~ 중복된 값이 계속 이어지는게 아니라 생략됨
		
	}

}
