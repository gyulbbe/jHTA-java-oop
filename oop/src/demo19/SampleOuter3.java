package demo19;

public class SampleOuter3 {

	private int x;
	private static int y;
	
	public void test1() {}
	public static void test2() {}
	
	public void test() {
		int a = 10;
		final int b = 10;
		
//		a = 5;
		
		/*
		 * 지역 내부클래스
		 * - 메소드 내부에 정의된 내부클래스다.
		 * - 메소드 내부에 정의되어 있기 때문에 메소드 외부에서는 사용할 수 없다.
		 * - 메소드 내부에 정의되어 있기 때문에 접근제한, static 키워드를 사용할 수 없다.
		 * - 메소드가 실행되는 동안 잠깐 사용하고 버리는 용도로 사용된다.
		 * - 지역 클래스가 정의된 메소드의 변수 중에서 final 키워드가 붙어 있거나, final처럼 동작하는 변수만 사용할 수 있다.
		 * 	즉, a변수처럼 변수가 생성된 다음에 값이 변경되는 변수는 지역내부클래스에서 접근할 수 없다.
		 */
		
		class Inner {
			public void test() {
				//외부 클래스의 모든 변수, 모든 메소드를 사용할 수 있다.
				System.out.println(x);
				System.out.println(SampleOuter3.y);
				test1();
				SampleOuter3.test2();
				
				//a=5 처럼 값의 변화가 있는 변수는 접근할 수 없다.
				System.out.println(a); // 컴파일 오류
				System.out.println(b);
			}
		}
		
		Inner inner = new Inner();
		inner.test();
	}
}