package demo14;

public class Galaxy extends SmartPhone{

	@Override
	public void call() {
		System.out.println("Galaxy의 call() 실행됨");
	}
	
	public void samsungPay() {
		System.out.println("Galaxy의 samsungPay() 실행됨");
	}
	
	public void recordVoice() {
		System.out.println("Galaxy의 recordVoice() 실행됨");
	}
}