package demo15;

public class App {

	public static void main(String[] args) {

		Tico car1 = new Tico();
		car1.drive();
		car1.speedUp();
		car1.speedDown();
		car1.stop();
		
		System.out.println();
		
		Car car2 = new Tico();
		car2.drive();
		car2.speedUp();
		car2.speedDown();
		car2.stop();
	}
}