package 객체지향_프로그래밍2;

class Deck {

	final int CARD_NUM = 52; // 카드의 총 갯수
	Card cardArr[] = new Card[CARD_NUM]; // Card 객체 배열 포함하기 Card[52]가 되는거임

	Deck() {
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);

			}

		}
	} // Deck()
	
	 
	// Card 클래스를 가져와서 메서드로 쓴다
	
	Card pick(int index) {
		return cardArr[index];		
		// return값으로 index에 입력된 값을 출력함


	} // Card pick(int index)

	
	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);	// 지역변수
		return pick(index);
		// return값으로 pick(index) 즉 0~51의 값을 무작위로 출력함

	}
	
	void shuffle() {
		for(int i=0; i<cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
			// 섞기
		}
	}

}
