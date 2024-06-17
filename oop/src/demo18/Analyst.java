package demo18;

public class Analyst {

	private DataReader reader;
	
	public Analyst() {}
	public Analyst(DataReader reader) {
		this.reader = reader;
	}
	
	public void setReader(DataReader reader) {
		this.reader = reader;
	}
	
	public void analyze() {
		System.out.println("분석하기");
		String data = reader.read();
		System.out.println(data);
	}
}
/*
 * Analyst는 DataReader 인터페이스에 의존한다.
 * Analyst는 DataReader 인터페이스를 구현한 다양한 구현객체와 조립할 수 있다.
 * Analyst는 조립된 구현객체의 재정의된 메소드를 호출하기 위해서 해당 객체의 주소값이 필요하지 않다.
 * 결론, Analyst는 구체적인 구현객체의 타입이 몰라도 해당 객체에 재정의 기능을 실행할 수 있다.
 * 따라서, Analyst에는 구체적인 구현클래스 대신 DataReader 인터페이스 타입의 참조변수가 필요하다.
 * 
 * Analyst는 자신이 의존하는 개체를 생성자 메소드나 Setter메소드를 통해서 외부로부터 제공받는다.
 * 
 * Analyst가 자신이 의존하는 객체를 외부 로부터 제공받기 위해서는
 * 1. Analyst가 객체가 조립될 참조변수의 타입을 인터페이스 타입으로 지정한다.
 *   인터페이스 타입의 변수는 해당 인터페이스를 구현한 모든 객체를 참조할 수 있다.
 *   다양한 구현객체가 조립가능해진다.
 *   Analyst와 DataReader 구현객체간의 결합이 느슨해진다.
 * 2. 매개변수 있는 생성자 메소드나 Setter 메소드를 정의한다.(멤버변수를 초기화한다.)
 * 
 * Analyst객체는 변화에 닫혀있고 확장에는 열려있는 SOLID중 O(개방폐쇄법칙)에 해당
 */