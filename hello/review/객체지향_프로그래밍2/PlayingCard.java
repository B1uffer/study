package 객체지향_프로그래밍2;

interface PlayingCard {
	public static final int SPADE = 4;		// public static final int SPADE = 4;
	final int DIAMOND = 3;					// public static fianl int DIAMOND = 3;
	static int HEART = 2;					// public static final int HEART = 2;
	int CLOVER = 1;							// public static final int CLOVER = 1;
	
	public abstract String getCardNumber();
	String getCardKind();		// public abstract String getCardKind();
	
	
}
