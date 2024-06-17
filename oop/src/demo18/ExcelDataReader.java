package demo18;

public class ExcelDataReader implements DataReader{

	@Override
	public String read() {
		System.out.println("ExcelDataReader의 read() 실행됨");
		return "엑셀 회계자료";
	}
}