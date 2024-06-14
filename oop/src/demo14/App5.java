package demo14;

public class App5 {

	//폰부터 폰의 자식들까지 다 가능(매개변수는 가장 조상이 가능하다)
	//만약 galaxy에서만 사용가능한 메서드를 적어버리면 당연히 오류가 나니까!
	public void testPhone(Phone phone) {
		
	}
	
	public void testPhone2(SmartPhone phone) {
		
	}
	
	public void testPhone3(Galaxy phone) {
		
	}
	
	public static void main(String[] args) {
		App5 app = new App5();
		
		Phone p1 = new Phone();
		SmartPhone p2 = new SmartPhone();
		Galaxy p3 = new Galaxy();
		Iphone p4 = new Iphone();
		
		app.testPhone(p1);
		app.testPhone(p2);
		app.testPhone(p3);
		app.testPhone(p4);
		
//		app.testPhone2(p1);
		app.testPhone2(p2);
		app.testPhone2(p3);
		app.testPhone2(p4);
		
//		app.testPhone3(p1);
//		app.testPhone3(p2);
		app.testPhone3(p3);
//		app.testPhone3(p4);
		
	}
}