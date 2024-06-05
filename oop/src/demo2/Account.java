package demo2;

/**
 * 계좌정보를 표현하는 클래스다.
 * <p>
 * 	예금주, 계좌번호, 비밀번호, 잔액 정보를 표현한다.
 * <p>
 * 	입금기능, 출금기능, 조회기능, 비밀번호 변경기능을 지원한다.	
 * 
 */
public class Account {
	private String owner;
	private String accNo;
	private int password;
	private long balance;
	
	/**
	 * 계좌정보를 개설한다.
	 * @param name 예금주 이름
	 * @param pwd 비밀번호
	 * @param amount 최초 입금액
	 */
	public void create(String name, int pwd, int amount) {
		//1. 매개변수로 전달받은 값을 필드에 대입한다.
		owner = name;
		password = pwd;
		balance = amount;
		
		//2. 계좌번호를 생성해서 필드에 대입한다.
		accNo = "1111";
		
		System.out.println("계좌개설: " + accNo);
	}
	
	//입금
	/**
	 * 계좌번호, 입금액을 전달받아서 잔액을 증가시킨다.
	 * @param no
	 * @param amount
	 */
	public void deposit(String no, int amount) {
		if (accNo != no) {
			System.out.println("계좌번호가 일치하지 않습니다.");
		} else {
			balance += amount;
		}
	}
	
	/**
	 * 전달받은 계좌번호의 비밀번호를 변경시킨다.
	 * @param no 계좌번호
	 * @param prevPwd 이전 비밀번호
	 * @param pwd 새 비밀번호
	 */
	public void changePassword(String no, int prevPwd, int pwd) {
//		if(accNo != no) {
//			System.out.println("계좌번호가 일치하지 않습니다.");
//		} else {
//			if(password != prevPwd) {
//				System.out.println("비밀번호가 일치하지 않습니다.");
//			} else {
//				if(prevPwd == pwd) {
//					System.out.println("이전 비밀번호와 같습니다.");
//				} else {
//					password = pwd;
//					System.out.println("비밀번호가 변경되었습니다.");
//				}
//			}
//		}
		
		//나쁜 경우를 찾아서 빨리 종료시키기(빠른 종료)
		if(accNo != no) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		}
		if(password != prevPwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		if(prevPwd == pwd) {
			System.out.println("이전 비밀번호과 같습니다.");
			return;
		}
		
		password = pwd;
		System.out.println("비밀번호가 변경되었습니다.");
		
	}
	
	/**
	 * 계좌번호를 전달받아서 일치하면 화면에 출력한다.
	 * @param no 계좌번호
	 */
	public void displayAccountInfo(String no) {
		/*
		 * 1. 전달받은 계좌번호와 객체의 계좌번호가 일치하지 않으면 오류 메시지를 화면에 출력한다.
		 */
		
		if(accNo != no) {
			System.out.println("계좌번호가 일치하지 않습니다.");
		} else {
			System.out.println("계좌번호: " + accNo);
			System.out.println("예금주: " + owner);
			System.out.println("예금잔액: " + balance + " 원");
		}
	}
	
	/**
	 * 계좌에서 돈을 출금하고 잔액을 감소시킨다.
	 * @param no 계좌번호
	 * @param pwd 비밀번호
	 * @param amount 출금할 금액
	 * @return 인출된 금액
	 */
	public long withdraw(String no, int pwd, int amount) {
//		if(accNo == no && password == pwd && balance >= amount) {
//			balance -= amount;
//			return amount;
//		} else {
//			System.out.println("");
//		}
		
		if(accNo != no) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return 0;
		}
		if(password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		System.out.println("인출금액만큼 잔액을 감소시키고, 반환합니다.");
		return amount;
	}
}