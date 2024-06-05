package demo2;

public class Sample {
	
	/*
	 * 반환타입
	 * 	void
	 * 	반환값이 없다.
	 * 매개변수
	 *  없다.
	 *  파라미터 값이 필요없다.
	 */
	void test1() {
		System.out.println("test1 메소드가 실행됨");
	}
	
	/*
	 * 반환타입
	 * 	void
	 * 매개변수
	 * 	int x
	 * 	이 메소드를 실행하기 위해서는 정수값 하나를 전달하자.
	 */
	void test2(int x) {
		System.out.println("test2 메소드가 실행됨");
		System.out.println("x의 값: " + x);
	}
	
	/*
	 * 반환타입
	 *  void
	 * 매개변수
	 *  int x, int y
	 *  정수 2개를 전달해야 한다.
	 */
	void test3(int x, int y) {
		System.out.println("test3 메소드가 실행됨");
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
	}
}