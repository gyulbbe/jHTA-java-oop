package demo22.sub1;

public class Sub1Sample2 {

	private void test1() {
		System.out.println("test1 실행됨");
	}
	
	void test2() {
		System.out.println("test2 실행됨");
	}
	
	protected void test3() {
		System.out.println("test3 실행됨");
	}
	
	public void test4() {
		System.out.println("test4 실행됨");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Sub1Sample2는 Sub1Sample1과 같은 패키지이기 때문에 Sub1Sample1을 접근할 수 있다.
		 * 
		 */
		Sub1Sample1 sample1 = new Sub1Sample1();
		
	}
}