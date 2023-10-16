package siibal;
// 1.

// 구조 설명

// 아랫놈(↓)은 클래스라고 합니다
// 클래스는 포장지? 상자? 같은거라고 생각하면 됩니다.
// 예를 들어볼까요.
// "사람이 걷는다/뛴다." 라는 단어가 있습니다.
// 주어는 뭔가요? 네. 사람입니다.
// 그러면 사람이 곧 클래스가 되는겁니다.
// 동사(기능)는 뭔가요? 네. 걷는다/뛴다 입니다.
// 그럼 얘는 메소드로 표현할 수 있겠네요!

// 메소드의 위치는 class 안에 선언됩니다.

public class Human {
	// 2.
	// 얘(↓)는 메인 '메소드'니까 그냥 냅둡니다
	// 다만, 얘도 '메소드' 라는것을 잊지 말아주세요.
	// -----아래로 이동 ------
	// public static void main(String[] args) {

	// }

	// 3.
	// 그럼 걷기/뛰기 기능을 구현해볼까요?
	// 얘(↓)를 살펴보죠.
	// static가 뭔지는 일단 제쳐두시고, 일단 달아둡시다.
	// void는 반환값입니다. void = 비어있다 즉, 반환값(return)이 없는것이죠.
	// Run은 메소드 이름입니다. 뛰는걸 의미하죠.
	// ()에는 매개변수가 들어갑니다. 지금은 아무것도 입력하지 않았지만 말이죠.
	// 그 다음 중괄호{}를 사용하여 Run() 메소드의 영역을 정해줍니다.
	// System.out.println()은 Run() 메소드가 실행하는 기능을 나타냅니다.

	static void Run() {
		System.out.println("뛰고 있습니다.");
	}

	// 4.
	// Walking()을 구현해보죠.
	// 여기서 Run()이랑 똑같이 구현하면 재미가 없겠죠?
	// 이름을 입력받아 "철수가 걷고 있습니다..."를 출력해보도록 하겠습니다.
	// 일단 static은 그냥 붙인다고 했죠?
	// static
	// 그리고 메소드에서 바로 출력을 한다고 했으니까 반환값은 void여도 상관없겠네요!
	// static void
	// 메소드명은 Walking이군요..
	// Static void Walking
	// 근데 이름을 입력받는대요. 이름.. String이죠. 즉,
	// Static void Walking(String name)
	// 그리고 중괄호를 넣어줍니다.
	// Static void Walking(String name) { }
	// 그리고 위에서 썼던 '뛰고 있습니다...'를 이용하여 써보죠!
	// static void Walking(String name) { System.out.println("걷고 있습니다...") }
	// 이제 name에 따라 철수가 걸을지, 영희가 걸을지 name을 사용해주어야 겠네요.
	// static void Walking(String name) { System.out.println(name + "(이)가 걷고
	// 있습니다..." }
	// 짜잔, Walking() 메소드 완성!

	static void Walking(String name) {
		System.out.println(name + "(이)가 걷고 있습니다.");
	}

	// 5.
	// 이번엔 이 사람이 게임하는지 '여부'를 나타내는 함수를 만들어볼게요!
	// 게임을 하면 true, 안하면 false로 나타내면 될 것 같아요!
	// 이 사람은 게임시간이 저녁 19부터 21시까지라고 하죠.
	// 자, 이제 구현해볼까요?
	// 일단 static은 붙혀줘야겠죠?
	// static
	// 게임을 하면 true, 안하면 false를 나타낸다 했으니, 반환값이 있군요?
	// 딱 맞는 자료형인 boolean을 사용합시다.
	// static boolean
	// 변수명이 필요하겠네요. 누가 게임하는지 알고 싶으니까 isGaming으로 나타내겠습니다.
	// static boolean isGaming
	// 소괄호를 넣어주시고
	// static boolean isGaming()
	// 이 사람이 19시 ~ 21시까지 게임을 한대요.
	// 그럼 이걸 이용해서 이 사람이 게임을 하는지 안하는지 알 수 있겠네요!
	// 만약 6시 47분이라면 false가 될 것이고, 8시 15분이면 true가 반환될거래요!
	// 중괄호도 넣어주고요!
	// static boolean isGaming(int time) { }
	// 이제 시간을 판정해볼까요?
	// 일단 7시 이후를 식으로 나타내면 time >=19가 되겠네요?
	// 그리고 9시 이하를 식으로 나타내면 time <= 21가 되겠구요.
	// 둘 다 참여될 때 이 사람은 게임을 하고 있겠군요?
	// && (and)로 묶어줍시다.
	// 그럼 나머지 시간은.. 게임을 하고있지 않겠네요.
	// 그럼 이렇게 메소드 완성입니다!

	static boolean isGaming(int time) {

		if (time >= 19 && time <= 21) {
			// 19시 ~ 21시는 게임중 상태임
			return true;

		} else {
			// 19시 ~ 21시가 아닌 시간은 게임을 하지 않습니다.
			return false;

		}

	}

	// 6.
	// 이번엔 변수에 대해 설명해볼까요?
	// '사람이 뛴다'라는 문장에서, 주어(객체)인 '사람'이 클래스가 된다고 했고,
	// '뛴다'라는 행동(기능)은 메소드가 된다고 했습니다.
	// 하지만 이 사람.. 이름과 나이는 있겠죠?
	// 그럼 이런 요소들을 변수로 선언해줍시다!
	// 예를들어, 20살 김철수씨라면 이렇게 선언이 됩니다.
	// 여기서 잠깐.. 이놈들(↓) 위치가 이상합니다.
	// 얘네는 메소드 안에 선언된 것이 아니라, 클래스 안에 선언되어 있어요!
	// 이런 경우, 이 변수들은 클래스 내부에서 마음껏 사용할 수 있답니다.
	static String name = "철수";
	static int age = 20;

	public static void main(String[] args) {

		// 7.
		// 드디어 메인 메소드를 사용해보네요!
		// 아까 구현한 메소드들을 이용해볼까요?
		// 이 사람이 게임을 하고 있지 않으면, 걷고있다고 해볼게요!
		// 일단 문장이 '~면' 이니까, if문으로 나타냅니다.
		// if( ) { }
		// 그리고 if()문 안에는 boolean 타입이 들어가야하죠.
		// 어? isGaming() 메소드는 반환값이 boolean 타입이네요?
		// 이걸 이용할 수 있겠군요!!
		// if(isGaming(17) == false) { }
		// 해석하면 '만약 17시에 게임을 하고 있지 않다면,'이 되겠군요.
		// 이제 이 사람은 게임을 하고있지 않다면, 걷고있는 상태라고 했어요.
		// Walking() 메소드를 사용할 때가 되었네요!
		// 하지만, 이 Walking() 메소드... 매개변수로 이름이 필요합니다.
		// 아까 변수로 선언했던 "김철수"를 써보도록 할까요?

		if (isGaming(17) == false) {
			Walking(name);
		}

	}

	// 8.
	// 먹는 함수를 만들려고 합니다.
	// 밥이 있으면 이 사람은 무조건 밥을 먹습니다.
	// 밥이 없다면, 이 사람은 무조건 밥을 안먹습니다.
	// 그럼, 만들어볼까요?
	// static을 넣어줍니다.
	// static
	// 밥을 먹는다 / 안먹는다에 따라 결과값이 출력이 되어야 하므로, true/false를 사용하는 boolean을 사용합니다.
	// static boolean
	// 변수명이 필요합니다. isEating으로 하죠.
	// static boolean isEating
	// 소괄호를 넣어줍니다.
	// static boolean isEating()
	// 중괄호도 넣어줍니다.
	// static boolean isEating( ) { }
	// boolean 메서드는 return값이 필요해요!
	// static boolean isEating( ) { return; }
	// 얼추 뼈대는 만들어졌네요!
	// 이 사람이 무조건 먹는건 밥이니까, 밥의 유무에 따라서 먹는지가 결정이 되겠죠.
	// 그럼 밥의 흑백을 가려보면 되겠네요?
	// 밥의 흑백을 가리기 위해 매개변수 rice에다가 boolean이라고 설정합시다.
	// static boolean isEating(boolean rice) { return; }
	// 이제 있다면, 없다면을 구현해야할 때네요!
	// 이라는 구문은 영어로 if니까 if를 씁시다.
	// static boolean isEating(boolean rice) { if( ) { } return; }
	// 밥을 먹는다면, 이 사람은 무조건 밥을 먹어요. 그 이외엔 밥을 안먹는다고 합니다.
	static boolean isEating(boolean rice) {
		if (rice == true) {
			
			return true;
			
		} else {
			
			return false;
		}

		
	}
	
	// 차가 있는지 없는지의 여부
	// 3,000만원 이상이면 있고, 아니면 없다
	
	static boolean carOwner(int money) {
		
		if(money >= 3000) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	// 누워있는지 누워있지 않은지의 여부
	// 01시부터 08시까지는 무조건 누워있다.
	
	static boolean isSleeping(int time) {
		
		if(time >= 1 && time <= 8) {
			
			return true;
			
		} else {
			
			return false;
			
		}

 	}
	
	
	// 일을 하고 있으면, 연봉이 3000원이다.
	// 일을 하고 있지 않으면, 연봉이 0원이다.
	
	static int GDP(boolean Working) {
		
		if(Working == true) {
			
			return 3000;
			
		} else {
			
			return 0;
			
		}
		
	}
	
	
}
