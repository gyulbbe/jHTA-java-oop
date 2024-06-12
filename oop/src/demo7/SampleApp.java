package demo7;

public class SampleApp {
	
	public static void main(String[] args) {
		
		//Sample에 정의된 정적변수 사용하기
		/*
		 * 1. Sample1.class 파일을 메모리 영역에 로딩한다.
		 * 2. Sample1.class 파일에 정의된 정적변수, 정적메소드를 즉시 사용가능한 상태로 만든다.
		 *    즉, 메모리영역에 정적변수 y를 생성하고 0으로 초기화한다.
		 * 3. 정적변수 y의 값을 이제 출력한다.
		 */
		System.out.println(Sample1.y);
		
		Sample1.y = 100;
		
		System.out.println(Sample1.y);
	}
}