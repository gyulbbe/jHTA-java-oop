package demo15;

/*
 * 모든 자동차가 반드시 포함해야 하는 기능을 정의하는 인터페이스다.
 * 즉, 자동차의 기능과 관련된 표준, 규격, 스펙을 정의하는 인터페이스다.
 */
public interface Car {

	//추상메소드
	void drive();		//public abstract void drive();
	void stop();
	void speedUp();
	void speedDown();
}
