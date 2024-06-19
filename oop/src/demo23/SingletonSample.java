package demo23;

public class SingletonSample {
	/*
	 * 싱글턴 객체
	 *  - 애플리케이션이 실행되는 동안 오직 하나의 객체만 생성해서 계속 재사용하는 객체다.
	 *  - 주로 기능을 제공하는 객체는 싱글턴 객체로 유지한다.
	 *  - 싱글턴 객체가 되는 방법
	 *   1. 생성자 메소드의 접근제한을 private로 한다.
	 *   2. 객체를 생성해서 정적변수에 대입한다.
	 *   	정적변수를 이용하면 설계도 로딩시에 객체 생성되어서 정적변수에 대입된다.
	 *   3. 2번에서 생성한 객체를 제공하는 정적 메소드를 작성한다.
	 *   4. 이 객체가 필요한 경우 3번 정적 메소드를 실행해서 2번 시점에 미리 생성해둔 객체를 반환받아서 사용한다.
	 */
	
	//싱글턴 객체를 위한 코드 시작
	//2. 객체를 생성해서 정적변수에 대입한다.
	private static SingletonSample instance = new SingletonSample();
	//3. 2번에서 생성한 객체를 제공하는 정적 메소드를 작성한다.
	public static SingletonSample getInstance() {
		return instance;
	}
	//1. 생성자 메소드의 접근제한을 private로 설정한다.
	private SingletonSample() {}
	//싱글턴 객체를 위한 코드 종료
	
	public void test1() {
		
	}
	public void test2() {
		
	}
}