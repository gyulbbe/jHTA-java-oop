package demo19;

public class SampleApp3 {

	public static void main(String[] args) {
		
		SampleOuter3 outer = new SampleOuter3();
		/*
		 * 지역내부 클래스가 정의된 test3() 메소드를 실행하자
		 * 지역내부 클래스는 메소드내에서만 사용가능하기 때문에
		 * 외부에서 지역내부 클래스에 접근할 수 없다.
		 */
		outer.test();
		
	}
}