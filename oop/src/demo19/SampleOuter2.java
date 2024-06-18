package demo19;

public class SampleOuter2 {

	private int x;
	private static int y;
	
	private void test1() {
		
	}
	
	private static void test2() {
		
	}
	
	/*
	 * 정적 내부 클래스
	 *  - 외부 클래스의 객체 생성 여부와 상관없이 사용가능한 내부클래스다.
	 *   즉, 외부 클래스의 멤버변수, 멤버메소드는 객체 생성한 이후에만 사용가능한 구성요소이기 때문에 
	 *   객체생성여부와 상관없이 사용가능한 정적 내부클래스에는 외부클래스의 멤버변수, 멤버메소드를 사용할 수 없다.
	 *  - 정적 내부클래스에서는 외부 클래스의 정적 변수, 정적 메소드만 사용할 수 있다.
	 *  - 정적 내부클래스는 static이 정의되어 있지만 메모리에 오직 하나만 생성되지는 않는다. <- 몰랐던 사실!
	 */
	static class Inner {
		//정적 내부클래스안에 멤버변수를 선언할 수 있다.
		int a;
		//정적 내부클래스안에 정적변수를 선언할 수 있다.
		static int b;
		
		public void test() {
			//외부클래스의 멤버변수를 사용할 수 없다.
//			System.out.println(x); // 컴파일 오류
			
			//외부클래스의 정적변수는 사용할 수 있다.
			System.out.println(SampleOuter2.y);
			
			//외부클래스의 멤버메소드를 사용할 수 없다.
//			test1(); // 컴파일 오류
			
			//외부클래스의 정적메소드는 사용할 수 있다.
			SampleOuter2.test2();
		}
	}
}