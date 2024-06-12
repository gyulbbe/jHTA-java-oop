package demo7;

public class HousingSibscriptionDeposit {

	private int no;
	private String owner;
	private int password;
	private long balance;
	
	//정적변수로 상수 정의
	public static final double INTEREST_RATE = 0.015;

	public HousingSibscriptionDeposit(int no, String owner, int password, long balance) {
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
	public void displayInfo() {
		long amount = (long) (balance + balance*HousingSibscriptionDeposit.INTEREST_RATE);
		System.out.println("-- 계좌 정보 -------------------------");
		System.out.println("계좌 번호: " + no);
		System.out.println("예금주: " + owner);
		System.out.println("비밀번호: " + password);
		System.out.println("예금잔액: " + balance);
		System.out.println("이율: " + HousingSibscriptionDeposit.INTEREST_RATE);
		System.out.println("해지금액: " + amount);
		System.out.println("------------------------------------");
	}
}