package demo19;

public class SampleApp2 {

	public static void main(String[] args) {
		
		/*
		 * SampleOuter2 클래스에 정의된 정적 내부 클래스 Inner로 객체 생성하기
		 */
		SampleOuter2.Inner inner1 = new SampleOuter2.Inner();
		SampleOuter2.Inner inner2 = new SampleOuter2.Inner();
		SampleOuter2.Inner inner3 = new SampleOuter2.Inner();
		
		System.out.println(inner1);
		System.out.println(inner2);
		System.out.println(inner3);
	}
}
