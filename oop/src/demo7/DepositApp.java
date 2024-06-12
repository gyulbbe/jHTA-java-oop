package demo7;

public class DepositApp {

	public static void main(String[] args) {
		System.out.println("이율: " + HousingSibscriptionDeposit.INTEREST_RATE);
//		HousingSibscriptionDeposit.INTEREST_RATE = 0.025;
//		System.out.println("이율: " + HousingSibscriptionDeposit.INTEREST_RATE);
		
		HousingSibscriptionDeposit deposit1 = new HousingSibscriptionDeposit(10, "홍길동", 1234, 300000);
		
		HousingSibscriptionDeposit deposit2 = new HousingSibscriptionDeposit(11, "김유신", 4567, 2500000);
		
		HousingSibscriptionDeposit deposit3 = new HousingSibscriptionDeposit(12, "강감찬", 8867, 670000000);
		
		deposit1.displayInfo();
		deposit2.displayInfo();
		deposit3.displayInfo();
	}
}