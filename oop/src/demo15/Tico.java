package demo15;

public class Tico implements Car{

	@Override
	public void drive() {
		System.out.println("Tico의 drive() 실행");
	}
	
	@Override
	public void stop() {
		System.out.println("Tico의 stop() 실행");
	}
	
	@Override
	public void speedUp() {
		System.out.println("Tico의 speedUp() 실행");
	}
	
	@Override
	public void speedDown() {
		System.out.println("Tico의 speedDown() 실행");
	}
}
