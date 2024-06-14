package demo14;

public class App6 {

	public void test(Phone p) {
		System.out.println(p);
		
		//전화걸기, 문자보내기 기능 테스트하기
		p.call();
		
		//인터넷기능 테스트하기
		//p가 참조하는 객체에 SmartPhone객체가 포함되어 있어야 한다.
		if(p instanceof SmartPhone) {
			((SmartPhone) p).internet();
		}
		
		//삼성페이 기능 테스트하기
		//p가 참조하는 객체에 Galaxy객체가 포함되어 있어야 한다.
		if(p instanceof Galaxy) {
			((Galaxy)p).samsungPay();
		}
		
		//애플페이 기능 테스트하기
		//p가 참조하는 객체에 Iphone객체가 포함되어 있어야 한다.
		if(p instanceof Iphone) {
			((Iphone)p).applePay();
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		SmartPhone p2 = new SmartPhone();
		Galaxy p3 = new Galaxy();
		Iphone p4 = new Iphone();
		
		App6 app = new App6();
		app.test(p1);
		app.test(p2);
		app.test(p3);
		app.test(p4);
	}
}