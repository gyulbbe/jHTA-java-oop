package demo14;

public class App3 {

	public static void main(String[] args) {

		Phone p1 = new Iphone();
		
		p1.call();
		p1.sms();
		
		System.out.println();
		
		SmartPhone p2 = (SmartPhone)p1;
		p2.call();
		p2.sms();
		p2.game();
	}
}