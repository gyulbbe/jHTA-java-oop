package demo15;

public class Genesis implements Car, AutoDrivable{

	@Override
	public void autoDrive() {
		System.out.println("Genesis의 autoDrive() 실행됨");
	}

	@Override
	public void autoParking() {
		System.out.println("Genesis의 autoParking() 실행됨");
	}

	@Override
	public void drive() {
		System.out.println("Genesis의 drive() 실행됨");
	}

	@Override
	public void stop() {
		System.out.println("Genesis의 stop() 실행됨");
	}

	@Override
	public void speedUp() {
		System.out.println("Genesis의 speedUp() 실행됨");
	}

	@Override
	public void speedDown() {
		System.out.println("Genesis의 speedDown() 실행됨");
	}
}