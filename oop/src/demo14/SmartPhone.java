package demo14;

/*
 * SmartPhone는 전화걸기, 문자보내기, 게임, 인터넷, 음악듣기 기능이 제공된다.
 * 전화걸기, 문자보내기는 Phone으로부터 상속받았다
 */
public class SmartPhone extends Phone {

	@Override
	public void sms() {
		System.out.println("SmartPhone의 sms() 실행됨");
	}
	
	public void game() {
		System.out.println("SmartPhone의 game() 실행됨");
	}
	
	public void internet() {
		System.out.println("SmartPhone의 internet() 실행됨");
	}
	
	public void music() {
		System.out.println("SmartPhone의 music() 실행됨");
	}
}