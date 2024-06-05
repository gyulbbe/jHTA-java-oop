package demo3;

public class ScoreApp {

	public static void main(String[] args) {
		
		Score s1 = new Score();
		Score s2 = new Score("김유신");
		Score s3 = new Score("강감찬", 60, 70, 100);
		
		s1.displayScore();
		s2.displayScore();
		s3.displayScore();
	}
}