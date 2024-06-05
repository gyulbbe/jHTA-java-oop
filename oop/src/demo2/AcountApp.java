package demo2;

public class AcountApp {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		//계좌개설하기 실행
		account.create("홍길동", 1234, 120000);
		
		//계좌정보 출력하기
//		account.displayAccountInfo("1111");
		
		//입금하기
		account.deposit("1111", 500000);
		account.displayAccountInfo("1111");
		
		//비밀번호 변경하기
//		account.changePassword("1111", 12, 123);
		
		//출금하기
		long money = account.withdraw("1111", 1234, 100000);
		System.out.println("출금금액: " + money);
	}
}