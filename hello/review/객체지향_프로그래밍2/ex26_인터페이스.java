package 객체지향_프로그래밍2;

public class ex26_인터페이스 {

	public static void main(String[] args) {
	
		Tank2 tank = new Tank2();
		Dropship2 dropship = new Dropship2();
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		Academy academy = new Academy();
		Bunker bunker = new Bunker();
		Barrack barrack = new Barrack();
		Factory factory = new Factory();
		Starport starport = new Starport();
		
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine);
		scv.repair(academy);	
		scv.repair(barrack);
		scv.repair(bunker);
		scv.repair(factory);
		scv.repair(starport);

	}

}
