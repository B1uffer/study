package 객체지향_프로그래밍2;

public class ex34_내부클래스4 {

	public static void main(String[] args) {
		
		// 내부 클래스의 제어자와 접근성에 대해 3
		
		// 인스턴스클래스의 인스턴스를 생성하기 위해선, 외부클래스의 인스턴스를 먼저 생성해야만 한다!!
		Outer oc = new Outer();		// 클래스의 인스턴스 생성
		
		
		Outer.InstanceInner ii = oc.new InstanceInner();	
		// Outer안의 InstanceInner 타입의 ii는 Outer(oc)의 InstanceInner를 참조한다
		
		
		System.out.println("ii.lv : " + ii.iv);
		
		
		// static클래스이기 때문에 인스턴스 생성 없이 사용 가능함
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		
		//static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 사용 가능하다!
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
	}

}
