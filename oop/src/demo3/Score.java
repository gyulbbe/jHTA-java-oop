package demo3;

public class Score {

	String name;
	int kor;
	int eng;
	int math;
	
	//기본생성자 메소드(default constructor)
	//컴파일러가 자동으로 추가하는 메소드
	public Score() {
		System.out.println("기본 생성자 메소드가 실행됨.");
		//멤버변수(필드)를 초기화 하는 것이 객체의 초기화 작업이다.
		name = "홍길동";
		kor = 100;
		eng = 100;
		math = 100;
	}
	
	public Score(String nameValue) {
		name = nameValue;
	}
	
	public Score(String nameValue, int korValue, int engValue, int mathValue) {
		name = nameValue;
		kor = korValue;
		eng = engValue;
		math = mathValue;
		System.out.println("이름, 국어, 영아, 수학 점수를 전달받는 생성자가 실행됨");
	}
	
	public void displayScore() {
		System.out.println("이름: " + name);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("국어: " + kor);
		System.out.println();
	}
}
