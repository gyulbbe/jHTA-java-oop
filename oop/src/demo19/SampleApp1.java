package demo19;

public class SampleApp1 {

	public static void main(String[] args) {
		
		SampleOuter1 outer = new SampleOuter1("홍길동", 100, 80, 90);
		outer.display();
		
		/*
		 * 멤버내부 클래스는 그 내부 클래스를 포함하고 있는 외부 클래스 내에서 사용되기 때문에
		 *  다른 클래스에서 내부 클래스로 객체를 생성하고,
		 *  내부 클래스의 메소드를 호출하는 경우는 없다.
		 */
		//외부클래스로 객체 생성한 다음에 멤버내부클래스로 객체 생성하기
		SampleOuter1.MemberInner inner = outer.new MemberInner();
		int total = inner.getTotal();
		double average = inner.getAverage();
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		//이런 식으로 사용하진 않음
	}
}