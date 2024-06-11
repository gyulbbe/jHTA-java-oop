package demo6;

/**
 * 학생 성적 정보 관련 업무로직 기능이 구현된 클래스다.
 */
public class StudentScoreService {
	
	//학생성적 정보 객체를 저장하는 배열객체를 생성한다.
	private StudentScore[] database = new StudentScore[100];
	//학생성적정보 객체를 배열 몇번째 칸에 저장할 지를 변수로 관리한다.
	private int position = 0;
	
	/**
	 * 학생성적 정보 객체가 저장된 배열 객체를 반환한다.
	 * @return
	 */
	public StudentScore[] gettAllScores() {
		return database;
	}
	
	/**
	 * 신규 학생성적정보를 전달바다서 저장시킨다.
	 * @param score 신규 학생성적정보
	 */
	public void saveScore(StudentScore score) {
		//전달받은 학생성적정보 객체를 배열의 지정된 칸에 지정한다.
		database[position]= score;
		//저장위치를 1증가시킨다.
		position++;
	}
	
	/**
	 * 학생 성적정보를 변경한다.
	 * @param no 학생번호
	 * @param subject 변경할 과목명
	 * @param score 변경할 점수
	 */
	public void updateScore(int no, String subject, int amount) {
		/*
		 * 1. 전달받은 학생번호와 일치하는 성적정보객체를 찾는다.
		 *  - 검색된 성적정보객체를 지정할 참조변수를 생성한다.
		 *  - 반복문을 이용해서 배열에 저장된 성적정보 객체를 하나씩 꺼낸다.
		 *   * 배열에서 꺼낸 객체가 null이면 반복을 탈출한다.
		 *   * 배열에서 꺼낸 객체가 null이 아니면 전달받은 학생번호와 일치하는 학생 성적정보인지 조사한다.
		 *   * 배열에서 꺼낸 객체의 학생번호와 전달받은 학생번호가 일치하면 위에서 정의한 참조변수에 주소를 대입한다.
		 */
		StudentScore foundScore = null;
		for(StudentScore score : database) {
			if(score == null) {
				break;
			}
			if(score.getNo() == no) {
				foundScore = score;
				break;
			}
		}
		
		//2. 검색된 성적정보가 없으면 오류메시지를 출력하고 메소드를 종료한다.
		if(foundScore == null) {
			System.out.println("### 일치하는 성적정보가 없습니다.");
			return;
		}
		
		/*
		 * 3. 전달받은 과목명과 일치하는 과목의 점수를 변경한다.
		 *  - 문자열 비교
		 *   * 문자열을 비교할 때는 == 연산자 대신 equals() 메소드를 사용한다. == 은 객체의 주소값을 비교
		 *   * equals(Object obj) 메소드는 문자열의 내용을 비교한다.
		 *   * equals(Object obj) 메소드의 반환값을 boolean 타입이다.
		 *    문자열의 내용이 일치하면 true, 일치하지 않으면 false를 반환한다.
		 */
		if("국어".equals(subject)) {
			foundScore.setKor(amount);
			System.out.println("### 국어과목 성적이 변경되었습니다.");
		} else if("영어".equals(subject)) {
			foundScore.setEng(amount);
			System.out.println("### 영어과목 성적이 변경되었습니다.");
		} else if ("수학".equals(subject)) {
			foundScore.setMath(amount);
			System.out.println("### 수학과목 성적이 변경되었습니다.");
		}
	}
	
	/**
	 * 학생 성적정보를 삭제한다.
	 * @param no 삭제할 학생번호
	 */
	public void deleteScore(int no) {
		/*
		 * 1. 전달받은 학생번호와 일치하는 성적정보객체를 찾는다.
		 *  - 검색된 성적정보객체가 저장된 위치를 다는 변수를 생성한다.
		 *  - 반복문을 이용해서 배열에 저장된 성적정보객체를 하나씩 꺼낸다.
		 *   * position위치 바로 앞까지 꺼내기 때문에 하나 꺼낸 성적정보객체가 null인지 체크할 필요가 없다.
		 *   * 배열에서 꺼낸 객체의 학생번호와 전달받은 학생번호가 일치하면 위에서 정의한 변수에 인덱스 값을 대입한다.
		 */
		int foundIndex = -1;
		for(int i = 0; i < position; i++) {
			StudentScore score = database[i];
			if(score.getNo() == no) {
				foundIndex = i;
				break;
			}
		}
		//2. foundIndex값이 -1이면 일치하는 성적정보가 발견되지 않은 경우다.
		if(foundIndex == -1) {
			System.out.println("### 일치하는 성적정보가 없습니다.");
			return;
		}
		
		//3. 배열에서 foundIndex 다음 칸부터 한 칸씩 앞으로 이동시킨다.
		for(int i = foundIndex; i < position; i++) {
			database[i] = database[i + 1]; 
		}
		
		//4. 다음 저장위치의 바로 앞 칸으로 null로 변경하고 position 값을 1 감소시킨다.
		database[position - 1] = null;
		position--;
		System.out.println("### 성적정보가 삭제되었습니다.");
	}
}