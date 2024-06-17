package demo18;

public class FactoryApp {

	public static void main(String[] args) {
		//앱 실행에 필요한 객체 생성하기
		TextDataReader textReader = new TextDataReader();
		ExcelDataReader excelReader = new ExcelDataReader();
		
		Analyst analyst = new Analyst();
		//Analyst객체는 DataReader류 객체에 의존하기 때문에 그 위에서 생성한 DataReader객체 중 하나를 의존성 역전 방식으로 조립한다.
		analyst.setReader(textReader);
		analyst.analyze();
	}
}