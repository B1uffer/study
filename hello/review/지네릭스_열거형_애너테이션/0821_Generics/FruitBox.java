package gene;

public class FruitBox <T extends Fruit & Eatable> extends Box<T>{
	
	// 타입 매개변수 T에 extends를 사용해 Fruit와 Eatable의 자손들만 타입으로 지정 가능하다
	// 또한 FruitBox 클래스는 Box<T>의 자손이므로 Box<T>의 메서드를 모두 사용한다
	
	// 한 종류의 타입만 담을 수 있지만, Fruit와 Eatable 클래스의 자손들로 제약된다
	
}
