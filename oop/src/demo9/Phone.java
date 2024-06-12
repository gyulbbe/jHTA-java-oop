package demo9;

public class Phone {

	private String tel;	//전화번호
	
	public Phone() {}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void call(String to) {
		System.out.println("Phone의 call()메소드 실행됨");
		System.out.println(tel + "이 " + to + "에게 전화를 건다.");
	}
}