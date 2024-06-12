package demo9;

public class PhoneApp {

	public static void main(String[] args) {

		//smartPhone 객체를 생성한다.
		SmartPhone p = new SmartPhone();
		
		//Phone객체의 setTel()메소드를 이용해서 Phone객체의 tel멤버변수에 값을 대입한다.
		p.setTel("010-1111-1111");
		p.call("010-2222-2222");
		
		//SmartPhone객체의 setIp() 메소드를 이용해서 SmartPhone객체의 ip 멤버변수에 값을 대입한다.
		p.setIp("192.168.10.1");
		System.out.println(p.getIp());
		p.internet();
		
		/*
		 * SmartPhone은 Phone을 상속받았다.
		 * smartPhone객체를 생성하면 Phone객체도 같이 생성된다.
		 * smartPhone객체를 참조하는 참조변수로 같이 생성된 Phone객체의 모든 공개된 속성과 기능을 사용할 수 있다.
		 * 감춰진 속성과 기능은 외부에서 접근할 수 없다.
		 * smartPhone을 참조하는 참조변수로 smartPhone의 숨겨진 속성과 기능을 접근할 수 없다.
		 */
	}
}