package demo15;

public class App2 {

	public static void main(String[] args) {
		
		Genesis car1 = new Genesis();
		car1.drive();
		car1.stop();
		car1.speedDown();
		car1.speedUp();
		car1.autoDrive();
		car1.autoParking();
		
		System.out.println();
		
		Car c2 = new Genesis();
		c2.drive();
		c2.stop();
		c2.speedDown();
		c2.speedUp();
//		c2.autoDrive();
//		c2.autoParking();
		
		System.out.println();
		
		AutoDrivable c3 = new Genesis();
		
//		c3.drive();
//		c3.stop();
//		c3.speedDown();
//		c3.speedUp();
		c3.autoDrive();
		c3.autoParking();
	}
}