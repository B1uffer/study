package ch4;						// if문, switch문

public class FlowEx1 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x = %d일 때, 참인 것은 %n", x);
		
		if(x==0)	System.out.println("x==0");		// 참
		if(x!=0)	System.out.println("x!=0");		// 거짓
		if(!(x==0))	System.out.println("!(x==0)");	// 거짓
		if(!(x!=0))	System.out.println("!(x!=0)");	// 거짓의 거짓 = 참
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은 %n",x);
		
		if(x==0)	System.out.println("x==0");
		if(x!=0)	System.out.println("x!=0");
		if(!(x==0))	System.out.println("!(x==0)");
		if(!(x!=0))	System.out.println("!(x!=0)");
		
	}

}
