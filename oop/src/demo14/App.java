package demo14;

public class App {

	public static void main(String[] args) {
		
		//smartPhone객체를 생성해서 Phone타입의 참조변수로 참조한다.
		Phone p = new SmartPhone();
		
		//생성한 객체는 smartPhone객체지만, 참조변수로 참조하는 객체가 Phone객체이기 때문에 Phone객체에 정의된 메소드만 실행가능하다.
		p.sms();
		p.call();
		
		System.out.println();
		
		//p참조하는 객체는 Phone객체지만, 실제로 생성한 객체는 smartPhone객체다.
		SmartPhone sm = (SmartPhone)p;
		sm.internet();
		sm.game();
		sm.music();
		
		((SmartPhone)p).internet();
		((SmartPhone)p).game();
		((SmartPhone)p).music();
	}
}