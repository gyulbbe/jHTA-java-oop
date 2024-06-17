package demo17;

/*
 * 추상클래스를 이용해서 변하는 코드와 변하지 않는 코드를 분리해서 구현한다
 * 
 * - 특정 작업은 매 작업을 실행할 때마다 전처리작업과 후처리작업이 필요한 경우가 있다.
 * - 이 경우, 전처리 작업과 후처리 작업은 작업의 내용에 상관없이 언제나 똑같은 코드가 실행되는 경향이 있다.
 * - 이런 경우에 개발자는 매 작업을 구현할 때마다 전처리작업, 핵심작업, 후처리작업을 구현하는 것은 비효율적이다.
 * - 개발자가 전처리작업, 후처리작업을 직접 구현하지 않고,
 *   핵심작업의 개발에만 집중할 수 있도록 추상클래스를 이용해서 전처리작업과 후처리작업을 미리 구현하고,
 *   개발자가 구현할 핵심작업을 추상메소드로 추상화할 수 있다.
 * - 추상클래스 내부에는 전처리작업, 핵심작업, 후처리작업을 순서에 맞게 배치해서 실행하는 메소드를 둔다.
 */
public abstract class AbstractJob {
/*
 * 전처리작업, 핵심작업, 후처리작업을 순서에 맞게 실행해주는 메소드다.
 */
	public void run() {
		before();
		before2();
		
		job();
		
		after();
		after2();
	}
	
	/*
	 * 매작업마다 달라지는 본작업을 추상화한 메소드다.
	 * 추상클래스에서 미리 구현한 클래스다.
	 */
	public abstract void job();
	
	private void before() {
		System.out.println("첫번째 전처리작업 실행됨");
	}
	
	private void before2() {
		System.out.println("두번째 전처리작업 실행됨");
	}
	
	private void after() {
		System.out.println("첫번째 후처리작업 실행됨");
	}
	
	private void after2() {
		System.out.println("두번째 후처리작업 실행됨");
	}
}