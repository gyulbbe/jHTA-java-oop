package demo9;

public class SmartPhone extends Phone {

	private String ip;
	
	public SmartPhone() {}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void internet() {
		System.out.println("smartPhone의 internet() 메소드 실행됨");
	}
}