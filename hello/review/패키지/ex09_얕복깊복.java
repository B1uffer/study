package 패키지;

public class ex09_얕복깊복 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(new Point2(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
	    Circle c3 = c1.deepCopy();
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println();
		
		
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		System.out.println(System.identityHashCode(c3));
		
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println();
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println();
	
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		System.out.println(System.identityHashCode(c3));
		
		
	}

	

}

			//Circle c2 = new Circle(Point2.createObj(3, 3), 5.0);
			
			
					//Circle c1 = new Circle(Point3(3,3), 5.0);
		


			//String s1 = "Hello";
			//String s2 = "Hello";
			
			//System.out.println(s1.hashCode());
			//System.out.println(s2.hashCode());
			
			//System.out.println();
			//s2 = "Hello2";
			
			//System.out.println(s1.hashCode());
			//System.out.println(s2.hashCode());



			//String s1 = "Hello";
			//String s2 = "Hello2";
			
			//System.out.println(System.identityHashCode(s1));
			//System.out.println(System.identityHashCode(s2));