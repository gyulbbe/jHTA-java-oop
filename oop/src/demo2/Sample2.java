package demo2;

public class Sample2 {

	void plus(int x, int y) {
		System.out.println("정수 + 정수 실행됨");
	}
	
	public void plus(int x, int y, int z) {
		System.out.println("정수 + 정수 + 정수 실행됨");
	}
	
	public void plus(double x, double y) {
		System.out.println("실수 + 실수 실행됨");
	}
	
	public void plus(double x, double y, double z) {
		System.out.println("실수 + 실수 + 실수 실행됨");
	}
}