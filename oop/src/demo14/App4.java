package demo14;

public class App4 {

	public static void main(String[] args) {
		
		Phone p1 = new Galaxy();
		
		Galaxy p2 = (Galaxy)p1;
		p2.samsungPay();
		p2.recordVoice();
		
		System.out.println();
		
//		Phone p3 = new SmartPhone();
		
		//ClassCastException 발생
//		Galaxy p4 = (Galaxy)p3;
//		p4.samsungPay();
//		p4.recordVoice();
	}
}
