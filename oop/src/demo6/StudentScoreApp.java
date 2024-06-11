package demo6;

import utils.Keyboard;

public class StudentScoreApp {

	//학생성적정보관련 업무로직이 구현된 StudentScoreService 객체를 생성해서 멤버변수 service에 연결시킨다.
	private StudentScoreService service = new StudentScoreService();
	
	public static void main(String[] args) {
		StudentScoreApp app = new StudentScoreApp();
		app.displayMenu();
	}
	
	//전체 조회 기능을 담당하는 메소드
	private void viewStudentScores() {
		System.out.println("<< 학생 성적 전체 조회 >>");
		
		//1. StudentScoreService 객체의 getAllScores 메소드를 실행해서 학생성적정보객체가 저장된 배열 객체를 반환받는다. <- 주소값을 받는다는 뜻
		StudentScore[] scores = service.gettAllScores();
		
		//2. 배열객체에서 순서대로 학생성적정보객체를 꺼내서 화면에 성적정보를 출력한다.
		System.out.println("------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("------------------------------");
		for(StudentScore score : scores) {
			if(score == null) {
				break;
			}
			System.out.print(score.getNo() + "\t");
			System.out.print(score.getName() + "\t");
			System.out.print(score.getKor() + "\t");
			System.out.print(score.getEng() + "\t");
			System.out.println(score.getMath());
		}
	}
	
	//등록 기능을 담당하는 메소드
	private void createdStudentScores() {
		System.out.println("<< 학생 성적 정보 등록 >>");
		
		//1. 사용자로부터 성적정보를 입력받는다.
		System.out.println("### 신규 학생성적 정보를 입력하세요.");
		System.out.print("학번을 입력하세요. : ");
		int no = Keyboard.readInt();
		System.out.print("이름을 입력하세요. : ");
		String name = Keyboard.readString();
		System.out.print("국어을 입력하세요. : ");
		int kor = Keyboard.readInt();
		System.out.print("영어을 입력하세요. : ");
		int eng = Keyboard.readInt();
		System.out.print("수학을 입력하세요. : ");
		int math = Keyboard.readInt();
		
		//2. StudentScore객체를 생성하고, 생성자 메소드의 매개변수 입력받은 값을 전달해서 객체를 초기화시킨다.
		//즉, 객체의 멤버변수에 성적정보를 대입한다.
		StudentScore studentScore = new StudentScore(no, name, kor, eng, math);
		
		//3. StudentScoreService 객체의 saveScore 메소드에 호출해서 성적정보를 데이터베이스에 저장시킨다.
		service.saveScore(studentScore);
		
		System.out.println("### 신규 학생정보가 저장되었습니다.");
	}
	
	//수정 기능을 담당하는 메소드
	private void updatedStudentScores() {
		System.out.println("<< 학생 성적 정보 수정 >>");
		
		//1. 수정할 정보를 입력받는다.
		System.out.println("### 수정할 정보를 입력하세요");
		System.out.println("학번을 입력하세요: ");
		int no = Keyboard.readInt();
		System.out.println("과목을 입력하세요: ");
		String subject = Keyboard.readString();
		System.out.println("새 점수를 입력하세요: ");
		int amount = Keyboard.readInt();
		
		//2.수정할 정보를 StudentScoreService객체의 updateScore 메소드 인자로 전달해서 실행시킨다.
		service.updateScore(no, subject, amount);
	}
	
	//삭제 기능을 담당하는 메소드
	private void deletedStudentScores() {
		System.out.println("<< 학생 성적 정보 삭제 >>");
		
		//1. 삭제할 성적정보의 학생번호를 입력받는다.
		System.out.println("### 삭제할 학생번호를 입력하세요.");
		System.out.println("학번을 입력하세요: ");
		int no = Keyboard.readInt();
		
		//2. StudentScoreService 객체의 deleteScore 메소드에 인자로 학번을 전달해서 호출한다.
		service.deleteScore(no);
	}
	
	private void displayMenu() {
		System.out.println("------------------------------");
		System.out.println("1.전체조회 2.등록 3.수정 4.삭제 0.종료");
		System.out.println("------------------------------");
		System.out.println();

		System.out.println("메뉴선택: ");
		int menuNo = Keyboard.readInt();

		if(menuNo == 1) {
			viewStudentScores();
			
		} else if(menuNo == 2) {
			createdStudentScores();
			
		} else if(menuNo == 3) {
			updatedStudentScores();
			
		} else if(menuNo == 4) {
			deletedStudentScores();
			
		} else if(menuNo == 0) {
			System.out.println("<< 프로그램 종료 >>");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println();
		
		displayMenu();
	}
}