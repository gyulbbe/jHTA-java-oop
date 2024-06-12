package demo7;

public class SampleApp2 {

	public static void main(String[] args) {
		
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		Sample1 s3 = new Sample1();
		
		//멤버변수 사용하기
		//멤버변수의 초기값 출력해보기
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		
		//멤버변수의 값 변경하기
		s1.x = 10;
		s2.x = 20;
		s3.x = 30;
		
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
	}
}