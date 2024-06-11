package demo6;
/**
 * 학생 성적 정보를 표현하는 클래스다.
 * 학번, 이름, 국어, 영어, 수학 점수를 표현한다.
 */
public class StudentScore {
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public StudentScore() {}

	public StudentScore(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public StudentScore(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//멤버변수가 없는 Getter 메소드를 정의하는 것이 가능한다.
	//주로 기존 멤버변수의 값을 가공해서 새로운 정보를 제공하는 경우
	//Getter 메소드로 그 기능을 제공할 수 있다.
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return getTotal()/3.0;
	}
}