package demo19;

public class SampleOuter1 {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public SampleOuter1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void display() {
		//멤버 내부클래스의 메소드 실행하기
		MemberInner inner = new MemberInner();
		//멤버 내부클래스의 메소드 실행하기
		int total = inner.getTotal();
		double average = inner.getAverage();
		
		System.out.println("-----성적 정보-----");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
	}
	
	/*
	 * 멤버내부 클래스
	 * 	- 멤버내부 클래스는 외부클래스의 모든 변수, 모든 메소드를 사용할 수 있다.
	 *  - 멤버내부 클래스는 private 접근제한을 적용해서 외부 접근을 차단하는 경우가 많다.
	 *  - 멤버내부 클래스는 이 내부 클래스를 포함하고 있는 외부 클래스에서 전용으로 사용하기 위해서 작성하기 때문이다.
	 */
	class MemberInner{
		
		public int getTotal() {
			int total = kor + eng + math;
			return total;
		}
		
		public double getAverage() {
			int total = kor + eng + math;
			double average = total/3.0;
			return average;
		}
		
	}
}