package 패키지;

public class ex23_wrapper_class {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? " + (i==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		// compareTo : 비교해서 같으면 0 크면 1 작으면 -1
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println();
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + "bits");
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
		System.out.println("TYPE = " + Integer.TYPE);

	}

}
