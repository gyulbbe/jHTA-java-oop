package demo23;

public class SampleApp {

	public static void main(String[] args) {

		/*
		 * SingleSample 클래스는 싱글턴 객체를 제공하는 클래스다.
		 *  - 싱글턴객체 제공을 지원하는 객체를 획득하는 방법은 객체를 직접 생성하는 것이 아니라,
		 *  미리 생성된 객체를 제공하는 getInsance() 정적 메소드를 실행한다.
		 *  - getInstance()를 실행해서 획득한 객체는 미리 생성해둔 변화를 제공받는 것이기 때문에 항상 같은 객체의 주소값이 반환된다.
		 */
		SingletonSample s1 = SingletonSample.getInstance();
		SingletonSample s2 = SingletonSample.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}