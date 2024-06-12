package demo7;

public class Sample2 {
	
	int x;							//멤버 변수, 인스턴스 변수
	static int y;					//정적 변수, 클래스 변수
	
	public void test1() {			//멤버 메소드, 인스턴스 메소드
		/*
		 * 멤버 메소드는
		 * 모든 멤버변수, 모든 정적변수를 사용할 수 있다.
		 */
		System.out.println(x);
		System.out.println(Sample2.y);
	}
	
	public void test2() {
		/*
		 * 멤버 메소드는 모든 멤버 메소드, 모든 정적 메소드를 사용할 수 있다.
		 */
		test1();
		Sample2.test3();
	}
	
	public static void test3() {	//정적 메소드, 클래스 메소드
		/*
		 * 정적 메소드는 멤버 메소드에 접근할 수 없다.
		 */
//		System.out.println(x);
		System.out.println(Sample2.y);
	}
	
	public static void test4() {
//		test1();
		Sample2.test3();
	}
}